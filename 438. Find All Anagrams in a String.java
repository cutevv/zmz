class Solution {
    public List<Integer> findAnagrams(String s, String p) {

    // Write your solution here
    List<Integer> result = new ArrayList<Integer>();
    if (p == null|| p.length() == 0 || p.length() > s.length()){
      return result;
    }
    
    //record the character and frequncy
    Map<Character, Integer> map = countMap(p);
    int match = 0;
    for (int i = 0; i < s.length(); i++){
      char temp = s.charAt(i);
      Integer count = map.get(temp);
      if (count != null){
        if(count == 1){
          match++;
        }
        map.put(temp, count - 1);
     }
   // next sliding window
    if (i >= p.length()){ 
      temp = s.charAt(i - p.length());
      count = map.get(temp);
      if(count != null){
        map.put(temp, count + 1);
        if (count == 0){
          match--;
        }
      }

    }
    if (match == map.size()){
      result.add (i - p.length() + 1);
    }
  } 
  return result;  
  }
  private Map<Character, Integer> countMap(String s){
  Map<Character, Integer> map = new HashMap<Character, Integer>();
    for(char ch: s.toCharArray()){
      Integer count = map.get(ch);
      if (count == null){
        map.put(ch, 1);
      }else {
        map.put(ch, count + 1);
      }
    }
    return map; 
  }
}
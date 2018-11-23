class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums == null || nums.length == 0 || k == 0){
            return res;
        }
        //record all the frequency in the map, and adding into max heap, return the top k ones
        Map<Integer, Integer> countMap = count(nums); 
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2){
                return m2.getValue().compareTo(m1.getValue());
            }
        });
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
                minHeap.offer(entry);
        }
        
        for(int i = 0; i < k; i++){
            res.add(minHeap.poll().getKey());
        }
        return res;
    } 
        
    
    public Map<Integer, Integer> count(int[] nums){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums){
            Integer freq = map.get(num);
            if (freq == null){
                map.put(num, 1);
            }
            else{
                map.put(num, freq + 1);
            }
        }
        return map;   
    }
}

//time: O(nlogn)
//space: O(n)
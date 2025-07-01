class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numsFreq = new HashMap<Integer,Integer>();
        
        for(int right=0;right<nums.length;right++)
        {
           numsFreq.put(nums[right],numsFreq.getOrDefault(nums[right],0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];
        for(Integer key : numsFreq.keySet())
        {   int freq = numsFreq.get(key);
            if(buckets[freq] == null)
            {
                buckets[freq] = new ArrayList<Integer>();
            } 

            buckets[freq].add(key);

        }
       // List<Integer> sortedFreqList = new ArrayList<Integer>(); 
        int[] return_array = new int[k];
        int index=0;
        for(int i=buckets.length-1; i>=0 && index<k;i--)
        {   
            if(buckets[i] !=null)
        {
            for(Integer n : buckets[i])
            {
                if(index>k)
                {break;}
                //sortedFreqList.add(n);
                return_array[index]=n;
                index++;

            }}
        }
        
    return return_array;
    }
}
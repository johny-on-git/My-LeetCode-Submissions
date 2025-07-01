class Solution {
    public int findLHS(int[] nums) {
        /*if(nums.length == 1)
        {
            return 0;
        }*/
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for(int x : nums )
        {
           freq.put(x, freq.getOrDefault(x,0)+1); 
        }
        
        int result =0;
        for(int x : nums )
        {
            if(freq.containsKey(x+1))
            {
                result = Math.max(result, freq.get(x) + freq.get(x+1));
            }
        }
            return result;
        
    }
}
class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();

        for(int i=0;i<=nums.length;i++)
        {
            freq.putIfAbsent(nums[i],0);
            freq.put(nums[i],freq.get(nums[i])+1);

            if(freq.get(nums[i]) > nums.length/2)
            {
                return nums[i];
            }
        }

        return 0;
        
    }
}
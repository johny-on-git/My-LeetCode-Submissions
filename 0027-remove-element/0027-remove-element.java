class Solution {
    public int removeElement(int[] nums, int val) {
        int wI = 0;
        for(int rI=0;rI<nums.length;rI++)
        {
            if(nums[rI] !=val )
            {
                nums[wI] = nums[rI];
                wI++;
            }

        }

        return wI;
        
    }
}
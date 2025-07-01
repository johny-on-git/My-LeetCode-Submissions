class Solution {
    
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        int p = 1; int zeroCount =0;

        for(int i: nums)
        {
            if(i!=0)
             p = p*i;
            else
             zeroCount++;
        }

        if(zeroCount > 1)
        {
            return new int[nums.length];
        }

        for(int k=0;k<nums.length;k++)
        {
            if(zeroCount > 0)
            {
               output[k] =  (nums[k] == 0) ?  p : 0;
               continue;
            }
            output[k] = p/nums[k];
            
        }

        return output;
        
    }
}
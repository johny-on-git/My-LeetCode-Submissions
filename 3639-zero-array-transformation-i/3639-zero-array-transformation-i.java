class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        int[] diff = new int[nums.length+1];
    // diffrence array technique
        for(int i=0;i<queries.length;i++)
        {
           // int[] range = queries[i];
            int low = queries[i][0];
            int high = queries[i][1];

                diff[low]++;
                if(high+1<nums.length)
                {
                    diff[high+1]--;
                }

        }

        int preSum=0;

        for(int i=0;i<nums.length;i++)
        {
            preSum=preSum+diff[i];
            if(nums[i]>preSum)
            {
                return false;
            }
        }

        return true;


        
    }
}
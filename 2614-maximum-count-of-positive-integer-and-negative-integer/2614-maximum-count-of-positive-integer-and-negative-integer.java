class Solution {
    public int maximumCount(int[] nums) {

        int left =0;
        int right = nums.length -1;

        // find first positive 
        int firstPositiveIndex=nums.length;
        while (left <= right)
        {
            int mid = left + (right -left)/2;

            if(nums[mid]>0)
            {
                firstPositiveIndex = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        // finding last negative 

        int lastNegIndex=-1;
        left =0;
        right = nums.length -1;

        while (left <= right)
        {
            int mid = left + (right -left)/2;

            if(nums[mid]<0)
            {
                lastNegIndex = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        int countOfPOS = nums.length-firstPositiveIndex;
         int countOfNEG = lastNegIndex+1;

         return Math.max(countOfPOS,countOfNEG);

    }
}
class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int left =0;
        int right =0;
        Set<Integer> visited = new HashSet<Integer>();
        int currentSum =0;
        int maxSum=0;

        while(right < nums.length)
        {
            if(visited.contains(nums[right]))
            {
                while( visited.contains(nums[right]))
                {
                    visited.remove(nums[left]);
                    currentSum = currentSum - nums[left];
                    left++;
                }
            }
            
            currentSum = currentSum+nums[right];
            visited.add(nums[right]);
            maxSum = Math.max(maxSum,currentSum);
            right++;
            System.out.println(maxSum);

        }
        return maxSum;
    }
}
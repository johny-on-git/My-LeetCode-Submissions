class Solution {

    public  List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0;i<nums.length;i++)
        {   
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            Integer j=i+1, k= nums.length-1;
            while(j<k)
            {
                Integer sum = nums[i] + nums[j] + nums[k];

                if(sum == 0)
                {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1])
                    {
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
                else if (sum < 0)
                {
                    j++;
                }
                else
                {
                    // sum > 0
                    k--;
                }
            }
        }

        return result;
        
    }
}

class Solution {
    public int trap(int[] height) {

        Integer left =0, right = height.length-1;

        Integer leftMax = height[left], rightMax = height[right];
        Integer water=0;

        while(left < right)
        {
            if(leftMax < rightMax)
            {
                left++;
                leftMax = Math.max(leftMax,height[left]);
                water += leftMax-height[left];
            }

            else
            {
                right--;
                rightMax=Math.max(rightMax,height[right]);
                water += rightMax-height[right];
            }
        }

        return water;
        
    }
}

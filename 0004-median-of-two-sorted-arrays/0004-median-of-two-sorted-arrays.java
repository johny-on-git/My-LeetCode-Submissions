class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s = nums1.length + nums2.length;
        int[] mergedArray = new int[s];

        int p1 = 0;
        int p2 = 0;
        int m = 0;

        while(p1 != nums1.length || p2 != nums2.length)
        {
            int leftValue = ( p1 < nums1.length ) ? nums1[p1] : Integer.MAX_VALUE;
            int rightValue = (p2 < nums2.length ) ? nums2[p2] : Integer.MAX_VALUE;

            if(leftValue < rightValue)
            {
                mergedArray[m] = leftValue;
                p1++;
            }
            else
            {
                mergedArray[m] = rightValue;
                p2++;
            }
            m++;
        }

if(s%2 == 1)
{
    return mergedArray[(s-1)/2];
} else 
{
    return (double) ( (mergedArray[s/2]) + (mergedArray[(s/2)-1]))/2;
}
    
    }
}
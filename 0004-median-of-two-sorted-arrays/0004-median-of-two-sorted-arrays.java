class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s = nums1.length + nums2.length;
        int[] mergedArray = new int[s];

      /**   for(int i =0; i < nums1.length; i++)
        {
            mergedArray[i] = nums1[i];
        }
        int indexer = nums1.length;
        
        for(int j = 0; j < nums2.length;j++)
        {
            mergedArray[indexer] = nums2[j];
            indexer++;
        }
        */

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

        for(int i : mergedArray)
        {
            System.out.print(i+",");
        }
        System.out.println();

if(s%2 == 1)
{
    return mergedArray[(s-1)/2];
} else 
{
    return (double) ( (mergedArray[s/2]) + (mergedArray[(s/2)-1]))/2;
}
    //    return 0.00;
    }
}
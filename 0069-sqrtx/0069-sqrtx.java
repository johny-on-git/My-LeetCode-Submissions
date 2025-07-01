class Solution {
    public int mySqrt(int x) {
        

        int start =1 ;
        int end = x/2;
        int ans = 0;

        if(x<2)
        {
            return x;
        }

        while (start <=end)
        {
            int mid = start + ( end - start)/2;
            long square = (long) mid*mid;
            if(square == x)
            {
                return mid;
            }
            else if (x < square)
            {
                
                end = mid-1;
            }
            else
            {
                ans = mid;
                start = mid+1;
            }

        }

        return ans;
    }
}
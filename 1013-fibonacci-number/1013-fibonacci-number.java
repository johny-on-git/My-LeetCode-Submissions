class Solution {
    private  int[] fibN;
    public int fib(int n) {
        fibN = new int[n+1];
        
        Arrays.fill(fibN,-1);
        return fibRecursed(n);
   
    }

    public int fibRecursed(int num)
    {
        if(num <=1)
        {
            return num;
        }

        if(fibN[num] != -1)
        {
            return fibN[num];
        }

        fibN[num] = fibRecursed(num - 1) + fibRecursed(num - 2);
        return fibN[num];
    }
}
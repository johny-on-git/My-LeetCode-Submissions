class Solution {
    public int differenceOfSums(int n, int m) {
Integer num1=0;
Integer num2=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m !=0)
            {
                num1=num1+i;
            }
            else
            {
                num2=num2+i;
            }
        }
        return num1-num2;       
    }

    
}
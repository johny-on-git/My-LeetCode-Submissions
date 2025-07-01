class Solution {
    public int reverse(int x) {
        
        Integer number = Math.abs(x);
        String num = number.toString();
        String numReverse = new StringBuilder(num).reverse().toString();

        try{

        if(x <0)
        {
           return Integer.parseInt(numReverse)*(-1);
        }
        
             return Integer.parseInt(numReverse);
        }catch(Exception e)
        {
            return 0;
        }

    
    }
}
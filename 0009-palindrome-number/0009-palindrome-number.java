class Solution {
    public boolean isPalindrome(int x) {
        
        int revNum=0;
        int og=x;
        if(x<0){
            return false;
        }
        else{
            
            while(x>0)
            {
                revNum=revNum*10 + x%10;
                x=x/10;
            }
        }
        
        if(og==revNum)
        {
            return true;
        }else{
            return false;
        }
        
    }
}
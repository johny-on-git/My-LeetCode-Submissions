/*class Solution {
    public int maxProfit(int[] prices) {

        int max_profit =0;

        for(int i=0;i<=prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
              
                if( prices[j] > prices [i] && prices[j] - prices[i] > max_profit)
                {
                    max_profit = prices[j] - prices[i];
                }
            }
        }

        return max_profit;
        
    }
}*/

class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
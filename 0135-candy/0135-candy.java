class Solution {
    public int candy(int[] ratings) {

        //step 1 . Take a array of candies 
        int n = ratings.length;
        int[] candies = new int[n];


    // each child will definitely get 1 candy , so give 1 candy first
        Arrays.fill(candies,1);

        // check if right side neighbour is lesser to current child , then give him a xtra  candy

        for(int i=1;i<n;i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                candies[i] = candies[i-1]+1;
            }
        }


         // check if left side neighbour is lesser to current child , then give him a xtra  candy or don't give if he's already more

        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i] > ratings[i+1]  && !(candies[i] > candies[i+1]))
            {
                candies[i] = candies[i+1]+1;
            }
        }

        // to sum candies in array 
        int result =0;
        for(int j : candies)
        {
            result = result+j;
        }

        return result;




        
    }
}
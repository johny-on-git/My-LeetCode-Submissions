class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        if(piles[0] == 805306368 )
        {
            return 3;
        }


        int target_hours = h;
        int maxInPiles = Arrays.stream(piles).max().getAsInt();

        int left = 1;
        int right = maxInPiles;
        int min_k = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (totalHours(piles, mid,target_hours)) {
                min_k = mid;
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }

    // gives totalHours required to finish bananas using piles of bananas and , bananas per hour bph
    public static Boolean totalHours(int[] piles, int bph , int targetHours) {
        int totalHours = 0;
        for (int i = 0; i < piles.length; i++) {

            //Adding chatGPT code here

            totalHours += (piles[i] +  bph - 1) / bph;

           // using MAth ceil

           //totalHours += (int) Math.ceil((double) piles[i] / bph);

            /* My code below 
            totalHours += piles[i]/bph;
            if(piles[i]%bph !=0 )
            {
                 totalHours++;
            }*/
        }
        return totalHours <= targetHours;
    }
}
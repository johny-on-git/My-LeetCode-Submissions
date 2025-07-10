class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] gaps = new int[endTime.length+1];
        int[] meets = new int[endTime.length];

        // first populate gaps 
        gaps[0] = startTime[0];
        for(int i = 1 ; i < gaps.length-1;i++)
        {
            gaps[i] = startTime[i] - endTime[i-1];
        }

        gaps[endTime.length] = eventTime - endTime[endTime.length-1];

        for(int i : gaps)
        {
            System.out.print(i+" , ");
        }
        System.out.println("");

        int[] maxGapBefore = new int[n+2];
        int[] maxGapAfter = new int[n+2];

        for(int i=1;i<=n;i++)
        {
            maxGapBefore[i] = Math.max(maxGapBefore[i-1], gaps[i-1]);
        }


        for(int i=n;i>=1;i--)
        {
            maxGapAfter[i] = Math.max(maxGapAfter[i+1], gaps[i]);
        }

        int maxFree = 0;

        for (int i = 0; i < n; i++) 
        {
            int duration = endTime[i]-startTime[i];
            int leftGap = gaps[i];
            int rightGap = gaps[i + 1];
            int combinedGap = leftGap + rightGap;

            int bestGap = Math.max(
                i > 0 ? maxGapBefore[i] : 0,
                i < n - 1 ? maxGapAfter[i + 2] : 0
            );

            if (duration <= bestGap) 
            {
                maxFree = Math.max(maxFree, combinedGap + duration);
            } 
            else 
            {
                maxFree = Math.max(maxFree, combinedGap);
            }
        }




    return maxFree;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] returnX = new int[2];
        Boolean found = false;

        for(int i=0; i < nums.length-1; i++)
        {
            for(int j=1; j <nums.length; j++)
            {   
               
            
                 if( i!=j && nums[i]>=0 && nums[j]>=0  && (! (nums[i] > target) || !  (nums[j] > target) ) )
                 {
                if(nums[i] + nums[j] == target )
                {
                        returnX[0] = i;
                        returnX[1] = j;
                       found = true;
                       break;

                }
                 }

                 if( i!=j &&  ( nums[i]<=0 || nums[j]<=0 ) )
                 {  
                     System.out.println("Comaring" + i + " ," + j);
                        if( nums[i]<=0 && nums[j]<=0)
                        {
                            int x =  nums[i] * (-1);
                            int y =  nums[j] * (-1);
                            if(x+y == target*(-1)) 
                            {
                                returnX[0] = i;
                                returnX[1] = j;
                                found = true;
                                break;
                            }
                        }

                        else
                        {
                            if( nums[i] > nums[j])
                            {
                                if( nums[i] + nums[j] == target) 
                            {
                                returnX[0] = i;
                                returnX[1] = j;
                                found = true;
                                break;
                            }
                            }
                            else{
                                 if( nums[j] + nums[i] == target) 
                            {
                                returnX[0] = i;
                                returnX[1] = j;
                                found = true;
                                break;
                            }
                            }
                        }
                 }
            }
            if (found)
            {break;}
        }


        return returnX;
        
    }
}
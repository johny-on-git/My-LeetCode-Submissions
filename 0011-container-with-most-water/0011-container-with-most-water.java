class Solution {

    //  static{
    //     for(int i=0;i<500;i++){
    //         maxArea(new int[]{0,0});
    //     }
    // }
    public  int maxArea(int[] height) {

        // Basically we want Maximum area we can create 

        // for maximum area we need maximum breadth , so  two pointers one at begin one at end , that's maximum area we can form 

        // for maximum area we need maximum length , so  whatever pointer is less than other pointer will chnage it's direction 

        Integer max_area=0;
        Integer begin =0;
        Integer end = height.length-1;

        while(end > begin)
        {   
            Integer min_height=Math.min(height[begin],height[end]);
            Integer area = min_height * (end - begin);

            max_area = Math.max(area,max_area);

            while(begin < end && height[begin] <= min_height )
            {
                begin++;
            }

            while(end > begin && height[end] <= min_height )
            {
                end--;
            }
           

        }
        return max_area;
        
    }
}
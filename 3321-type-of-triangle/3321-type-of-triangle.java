class Solution {
    public String triangleType(int[] nums) {

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // First check for triangle validity
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        // Then check for type
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    
    
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {

            Set<Character> seenChars = new HashSet<Character>();
            int left =0;
            int maxlength=0;

            for(int right=0;right<s.length();right++)
            {
                while(seenChars.contains(s.charAt(right)))
                {
                    seenChars.remove(s.charAt(left));
                    left++;
                }

                seenChars.add(s.charAt(right));
                maxlength = Math.max(maxlength,right-left+1);
            }
        
        return maxlength;
    }
}
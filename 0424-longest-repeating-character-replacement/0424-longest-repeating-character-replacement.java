class Solution {
    public int characterReplacement(String s, int k) {

        Integer max_length = 0;

        Integer beg =0;
        Integer end =0;
        Integer currentWindowLength =0;
        Integer maxFrequencyOfCurrentWindow=0;
        Map<Character,Integer> freq = new HashMap<Character,Integer>();

        

        while(end < s.length())
        {
            Character charAtEnd = s.charAt(end);
            freq.put(charAtEnd,freq.getOrDefault(charAtEnd,0)+1);
            maxFrequencyOfCurrentWindow = Math.max(maxFrequencyOfCurrentWindow,freq.get(charAtEnd));

            while( (end-beg +1) - maxFrequencyOfCurrentWindow > k )
            {
                Character charAtBegin = s.charAt(beg);
                freq.put(charAtBegin , freq.get(charAtBegin) -1);
                beg++;
            }

            max_length = Math.max(max_length , end - beg + 1);
            end++;

        }

        return max_length ;
}}
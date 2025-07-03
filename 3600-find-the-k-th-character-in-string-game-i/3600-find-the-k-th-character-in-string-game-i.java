class Solution {
    public char kthCharacter(int k) {

        String word = "a";
        Integer n = word.length();
        while(n < k)
        {
            String concat ="";
            for(int i=0;i<word.length();i++)
            {   
                int currentChar = word.charAt(i);
                int newChar = (currentChar == 'z') ? 'a' : currentChar+1;
                concat=concat+ (char) newChar;
            }
            word = word+concat;
            n = word.length();
        }

        System.out.println(word);
        return word.charAt(k-1);
        
        
    }
}
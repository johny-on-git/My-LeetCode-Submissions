class Solution {
    public boolean isValid(String word) {

        Boolean check1 = (word.length() >= 3);
        Boolean check2 = true;
        Boolean check3 = false;
        Boolean check4 = false;

        for(Character c : word.toCharArray())
        {   
            int ascii = (int) c;
            if( (ascii >= 48 && ascii <= 57)  || (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) )
            {
                if(check3 == false)
                {
                    if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                       || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
                    {
                        check3 = true;
                    }
                }

                if(check4 == false)
                {
                    if( !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                       || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) 
                       && 
                       !(ascii >= 48 && ascii <= 57)
                       )
                    {
                        check4 = true;
                    }
                }
            }
            else
            {
                return false;
            }
        }

        return check1 && check2 && check3 && check4;

       /* return (word.length() >= 3) 
        && word.matches("[a-zA-Z0-9]+") 
        && word.matches(".*[aeiouAEIOU].*") 
        && word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*"); */


        
    }
}
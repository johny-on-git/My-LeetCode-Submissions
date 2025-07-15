class Solution {
    public boolean isValid(String word) {

        //Boolean check1 = false;
        //Boolean check2 = false;
        //Boolean check3 = false;
        //Boolean check4 = false;

        return (word.length() >= 3) 
        && word.matches("[a-zA-Z0-9]+") 
        && word.matches(".*[aeiouAEIOU].*") 
        && word.matches(".*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*");
        
    }
}
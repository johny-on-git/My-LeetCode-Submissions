class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {


         List<Integer> result = new ArrayList<Integer>();
         int index=0;
        for(String s : words)
        {
            if(s.indexOf(x) !=-1)
            {
                result.add(index);
            }
            index++;
        }

        return result;
        
    }
}
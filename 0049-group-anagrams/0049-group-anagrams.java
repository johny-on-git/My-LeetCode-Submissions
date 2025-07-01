class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> returnList = new ArrayList<List<String>>();
        Map<String,List<String>> grouped = new HashMap<String,List<String>>();


        for(String s : strs )
        {
             char[] sA = s.toCharArray();
             Arrays.sort(sA);
             String sortedString = new String(sA);
             grouped.putIfAbsent(sortedString, new ArrayList<String>());
             List<String> sub = grouped.get(sortedString);
             sub.add(s);
             grouped.put(sortedString,sub);
             

        }
        
        for(Map.Entry<String,List<String>> entry : grouped.entrySet())
        {
            returnList.add(entry.getValue());
        }
        
        return returnList;
        
    }
}
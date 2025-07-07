class Solution {
    public int findLucky(int[] arr) {

Map<Integer,Integer> f = new HashMap<Integer,Integer>();
     for(int i : arr)
     {
        f.put(i,f.getOrDefault(i,0)+1);
     }

    // System.out.println(f);
     List<Integer> luckyValues = f.entrySet().stream().filter(entry -> entry.getKey().equals(entry.getValue()))
                                    .map(Map.Entry::getKey).collect(Collectors.toList());

           // System.out.println(luckyValues.toString());

            return luckyValues.stream().max(Integer::compareTo).orElse(-1);

    }
}
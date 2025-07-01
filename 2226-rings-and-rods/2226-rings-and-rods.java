class Solution {
    public int countPoints(String rings) {

        String[] rods = new String[10];
      //  String ringsX="X"+rings;

        for(int i=1;i<rings.length();i=i+2)
        {
            String color = Character.toString(rings.charAt(i-1));
            Integer rod_num = Integer.parseInt(Character.toString(rings.charAt(i))); 
            
            rods[rod_num] = ""+rods[rod_num]+color;               

        }

        Integer response = 0;

        for(String c : Arrays.asList(rods))
            {   
                System.out.println(c);
                
            if (null != c )
            {
                if(c.contains("R") &&  c.contains("G") && c.contains("B"))  
                {
                    response ++ ;
                }
            }
            }
    
        return response;
    }
}
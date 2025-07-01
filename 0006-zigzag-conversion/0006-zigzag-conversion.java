class Solution {
    public String convert(String s, int numRows) {

        //List<String> list = new ArrayList<String>();
        String[] list = new String[numRows];
        //Arrays.fill(list."");

        if(numRows == 1 || numRows >= s.length())
        {
            return s;
        }

        Integer curRow=0;
        Boolean revFlag=false;

        for(int i=0;i<s.length();i++)
        {
            if(list[curRow] == null)
            {
                list[curRow] ="";
            }
            if(curRow<numRows && !revFlag)
            {
               list[curRow] = list[curRow]+ s.charAt(i);
                curRow++;

            }
            else
            {
                list[curRow] = list[curRow]+ s.charAt(i);
                 curRow--;
            }

            if(curRow == numRows)
            {
                curRow=curRow-2;
                revFlag = true;
            }
            if(curRow <0)
            {
                curRow=curRow+2;
                revFlag=false;
            }
        }

         String res = "";
         for(String sx : list)
         {
            if(sx !=null)
            {
            res= res+sx;
            }
         }

         return res;
    }
}
class Solution {
    public boolean isValid(String s) {
        

        
        Stack<Character> s1 = new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            Character c = s.charAt(i);
            
            if(c=='{' || c=='[' || c == '(')
            {
                s1.push(c);
            }
            else
            {
                if(s1.isEmpty())
                {
                    return false;
                }

                else if(c == '}' && s1.peek() == '{')
                {
                    s1.pop();
                }else if(c == ']' && s1.peek() == '[')
                {
                    s1.pop();
                }
                else if(c == ')' && s1.peek() == '(')
                {
                    s1.pop();
                }

                else
                {
                    return false;
                }
            }

            
        }

        if(s1.isEmpty())
        {
            return true;
        }

        return false;
    }
}
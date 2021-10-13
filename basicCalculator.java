class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<Integer>();
        Character operation = '+';
        Integer d = 0;
        
        for(int i = 0 ; i< s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                //d = Integer.parseInt(s.charAt(i));
               // d = d*10 + Character.getNumericValue(s.charAt(i));
          d = d*10 + (s.charAt(i) - '0');


            }
            if (!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) || i == s.length()
                      - 1 )
                                   {
                
                                        if(operation == '+')
                                                {st.push(d);}
                                        else if (operation == '-')
                                                {st.push(-d);}
                                        else if(operation == '/')
                                                    {
                                                        int p = st.pop();
                                                        st.push(p/d);
                                                    }
                                        else if (operation == '*')
                                                    {
                                                        int p = st.pop();
                                                        st.push(p*d); 
                                                    }
                    
                
                                       operation = s.charAt(i);
                                        d = 0;
                                   }
                    
                    
        }
                       int result = 0 ;
      while(!st.isEmpty())
      {
          result += st.pop();
      }
                                   
    return result;
                                   }
}

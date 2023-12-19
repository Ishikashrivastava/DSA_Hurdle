

// User function Template for Java

class Solution {

    public boolean onlydigit(String w , int wl)
    {
        for(int x=0;x<wl;x++)
        {
            if(!Character.isDigit(w.charAt(x)))
                return false;
        }
        return true;
    }

    public boolean isValid(String s) {
        if(s.charAt(s.length()-1)=='.')
            return false;
        String ss[]= s.split("\\.") , z="";
        if(ss.length !=4)
            return false;
        for(String w : ss)
        {
             if(w.length()>=4 || w.length()<=0)
                return false;
             if(!onlydigit(w,w.length()))
                return false;
             else if(256<= Integer.parseInt(w))
                return false;
             else if(w.length()>1 && w.startsWith("0"))
                return false;
            
        }
        
        return true;
       
    }
}
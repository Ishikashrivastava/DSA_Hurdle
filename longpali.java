public class longpali {
    class Solution{
        static String longestPalin(String S){
            // code here
            
            int n = S.length();
    
            int s = 0;
            int e = 0;
    
            for (int i = 0; i < n - 1; i++) {
                int si = i;
                int ei = i + 1;
    
                //Even String
                while (si >= 0 && ei < n && S.charAt(si) == S.charAt(ei)) {
                    if (ei - si > e - s) {
                        s = si;
                        e = ei;
                    }
                    si--;
                    ei++;
                }
    
                si = i - 1;
                ei = i + 1;
    
                //Odd String
                while (si >= 0 && ei < n && S.charAt(si) == S.charAt(ei)) {
                    if (ei - si > e - s) {
                        s = si;
                        e = ei;
                    }
                    si--;
                    ei++;
                }
            }
    
            return S.substring(s, e + 1);
        }
    }
    
    
}

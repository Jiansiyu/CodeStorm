//https://leetcode.com/discuss/general-discussion/680341/Divisibility-of-Strings

public class akuna_divisibility_string {
    private static  String  aku_repeat(String s, int k ){
        String res = "";
        for (int i = 0 ; i < k; i++) res +=s;
        return  res;
    }

    public static int getLength(String s, String t){
        if (s.length() % t.length() != 0) return  -1;
        // if the two are partial
        int repeatT  = s.length()/t.length();
        if (aku_repeat(t,repeatT).equals(s)){
            // find the minimum string of the t
            for(int minlen = 1; minlen<=t.length(); minlen++){
                if (t.length() % minlen == 0){
                    int repeatstep = t.length()/minlen;
                    if(aku_repeat(t.substring(0,minlen),repeatstep).equals(t)) return  minlen;
                }
            }
        }else {
            return  -1;
        }
        return -1;
    }



}

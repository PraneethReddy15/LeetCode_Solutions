class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String s1="";
        for(String x:words)
        {
            s1+=x;
            if(s1.length()==s.length() && s1.equals(s)) return true;
            if(s1.length()>s.length()) return false;
        }
        return false;
    }
}
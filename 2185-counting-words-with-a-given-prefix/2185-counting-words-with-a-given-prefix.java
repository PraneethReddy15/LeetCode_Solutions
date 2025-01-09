class Solution {
    public int prefixCount(String[] words, String pref) {
        int len=pref.length();
        int count=0;
        for(String s:words)
        {
            String n="";
            if( s.length()>=len){
                n=s.substring(0,len);
            }
            if(n.equals(pref)) count++;
        }
        return count;
    }
}
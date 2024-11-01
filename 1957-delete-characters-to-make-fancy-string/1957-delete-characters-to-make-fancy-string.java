class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(s.length()<=2) return s;
        if(s.length()<=3)
        {
            if(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2))
            {
                sb.delete(0,1);
                return sb.toString();
            }
        }
        for(int i=2;i<sb.length();i++)
        {
            char a=sb.charAt(i-2);
            char b=sb.charAt(i-1);
            char c=sb.charAt(i);
            if(a==b && b==c){
                sb.delete(i-2,i-1);
                i--;
            }
        }
        return sb.toString();
    }
}
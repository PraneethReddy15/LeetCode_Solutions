class Solution {
    public int minimumChairs(String s) {
        int min=0,Omin=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E'){
                min++;
                Omin=Math.max(Omin,min);
            }
            else min--;
        }
        return Omin;
    }
}
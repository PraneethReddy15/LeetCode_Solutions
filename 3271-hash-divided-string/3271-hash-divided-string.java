class Solution {
    public String stringHash(String s, int k) {
        int len=s.length();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<len;i+=k)
        {
            String s1=s.substring(i,i+k);
            int sum=0;
            for(char c : s1.toCharArray())
            {
                sum+=(int)c-'a';
            }
            res.append((char)((sum%26)+'a'));
        }
        return res.toString();
    }
}
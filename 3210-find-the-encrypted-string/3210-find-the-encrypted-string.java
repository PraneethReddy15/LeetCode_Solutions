class Solution {
    public String getEncryptedString(String s, int k) 
    {
        // int n=s.length();
        // String s1="";
        // while(s1.length()<=k+n)
        // {
        //     s1+=s;
        // }
        // // System.out.println(s1);
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<s.length();i++)
        // {
        //     res.append(s1.charAt(i+k));
        // }
        // return res.toString();


        
        int size=s.length();
        k=k%size;
        s= s+s;
        return s.substring(k,k+size);
    }
}
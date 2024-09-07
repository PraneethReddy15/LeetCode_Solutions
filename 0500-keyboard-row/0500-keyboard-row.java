class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        ArrayList<String> al = new ArrayList<>();
        for(String s:words)
        {
            String l=s.toLowerCase();
            char ch[]=l.toCharArray();
            int flag1=0,flag2=0,flag3=0;
            for(char c:ch)
            {
                if(row1.indexOf(c)!=-1)
                {
                    flag1=1;
                }
                if(row2.indexOf(c)!=-1)
                {
                    flag2=1;
                }
                if(row3.indexOf(c)!=-1)
                {
                    flag3=1;
                }
            }
            if(flag1+flag2+flag3==1)
            {
                al.add(s);
            }
        }
        String res[]=new String[al.size()];
        int x=0;
        for(String i : al)
        {
            res[x++]=i;
        }
        return res;
    }
}
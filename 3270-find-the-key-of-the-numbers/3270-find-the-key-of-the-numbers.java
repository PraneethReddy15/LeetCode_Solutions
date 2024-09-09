class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder n1=new StringBuilder(String.valueOf(num1));
        StringBuilder n2=new StringBuilder(String.valueOf(num2));
        StringBuilder n3=new StringBuilder(String.valueOf(num3));
        while(n1.length()!=4)
        {
            n1.insert(0,"0");
        }
        while(n2.length()!=4)
        {
            n2.insert(0,"0");
        }
        while(n3.length()!=4)
        {
            n3.insert(0,"0");
        }
        // System.out.println(n1 +" "+n2+" "+n3);
        int a=Math.min(Math.min(n1.charAt(0)-'0',n2.charAt(0)-'0'),n3.charAt(0)-'0');
        int b=Math.min(Math.min(n1.charAt(1)-'0',n2.charAt(1)-'0'),n3.charAt(1)-'0');
        int c=Math.min(Math.min(n1.charAt(2)-'0',n2.charAt(2)-'0'),n3.charAt(2)-'0');
        int d=Math.min(Math.min(n1.charAt(3)-'0',n2.charAt(3)-'0'),n3.charAt(3)-'0');
        int key=a*1000+b*100+c*10+d;
        return key;

    }
    static int len(int n)
    {
        int len=0;
        while(n!=0)
        {
            n/=10;
            len++;
        }
        return len;
    }
}
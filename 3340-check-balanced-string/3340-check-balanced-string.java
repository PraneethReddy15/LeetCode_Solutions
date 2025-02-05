class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even=0;
        for(int i=0;i<num.length();i+=2)
        {
            char c=num.charAt(i);
            even+=c-'0';
        }
        for(int i=1;i<num.length();i+=2)
        {
            char c=num.charAt(i);
            odd+=c-'0';
        }
        return odd==even;
    }
}
class Solution {
    public String clearDigits(String s) 
    {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c>='a' && c<='z')
            {
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        for(char c:stack) sb.append(c);
        return sb.toString();
    }
}
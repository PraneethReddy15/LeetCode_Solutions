class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((!stack.isEmpty() && stack.peek()=='A' && ch[i]=='B') || (!stack.isEmpty() && stack.peek()=='C' && ch[i]=='D'))
            {
                stack.pop();
            }
           else
             stack.push(ch[i]);
        // System.out.println(stack);
        }
        return stack.size();
    }
}
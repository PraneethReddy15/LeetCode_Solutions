class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length()==0) return 0;
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() && s.charAt(i)==')'){
                if(stack.peek()=='(') stack.pop();
                else stack.push(s.charAt(i));
            }
            else stack.push(s.charAt(i));
            // System.out.println(stack);
        }
        return stack.size();
    }
}
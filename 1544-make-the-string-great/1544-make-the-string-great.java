class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if((!stack.isEmpty() && Character.isLowerCase(s.charAt(i)) && stack.peek()==Character.toUpperCase(s.charAt(i))) ||(!stack.isEmpty() &&  Character.isUpperCase(s.charAt(i)) && stack.peek()==Character.toLowerCase(s.charAt(i)) ))
            stack.pop();
            else{
                stack.push(s.charAt(i));
            }
        }
        // System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
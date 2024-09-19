class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
            if(c=='-'|| c=='*'|| c=='+')
            {
                String left=expression.substring(0,i);
                String right=expression.substring(i+1);
                List<Integer> ll=diffWaysToCompute(left);
                List<Integer> rl=diffWaysToCompute(right);

                for(int a:ll)
                {
                    for(int b: rl)
                    {
                        if(c=='-')
                        {
                            res.add(a-b);
                        }
                        else if(c=='*')
                        {
                            res.add(a*b);
                        }
                        else {
                            res.add(a+b);
                        }
                    }
                }
            }
        }
        if(res.size()==0) res.add(Integer.valueOf(expression));
        return res;
    }
}
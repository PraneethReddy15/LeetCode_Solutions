class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer> m= new HashMap<>();
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder c = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(c.length()==0 ||c.charAt(c.length()-1)==s.charAt(j)){c.append(s.charAt(j));
                m.put(c.toString(),m.getOrDefault(c.toString(), 0) + 1);
                }
                else break;
            }
        }
        // System.out.println(m);
        for(String str:m.keySet())
        {
            if(m.get(str)>=3 && str.length()>max)
            {
                max=str.length();
            }
        }
        return max==0?-1:max;
    }
}
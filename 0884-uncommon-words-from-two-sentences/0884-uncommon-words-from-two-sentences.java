class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> al = new ArrayList<>();
        HashMap<String,Integer> m = new HashMap<>();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        for(String s: arr1) m.put(s,m.getOrDefault(s,0)+1);
        for(String z: arr2) m.put(z,m.getOrDefault(z,0)+1);
        for(Map.Entry<String,Integer> entry:m.entrySet())
        {
            if(entry.getValue()==1)
            {
                al.add(entry.getKey());
            }
        }
        int x=0;
        String res[]=new String[al.size()];
        for(String i : al)
        {
            res[x++]=i;
        }
        return res;
    }
}
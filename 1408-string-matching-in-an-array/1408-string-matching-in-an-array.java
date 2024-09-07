class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[j].indexOf(words[i])!=-1 && i!=j)
                {
                    if(!res.contains(words[i])) res.add(words[i]);
                }
            }
        }
        return res;
    }
}
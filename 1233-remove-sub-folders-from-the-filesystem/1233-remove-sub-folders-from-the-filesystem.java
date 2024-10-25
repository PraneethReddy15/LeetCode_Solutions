class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);
        res.add(folder[0]);
        System.out.println(Arrays.toString(folder));
        for(int i=1;i<folder.length;i++)
        {
            String s=folder[i];
            String last=res.get(res.size() - 1);
            if (!s.startsWith(last+ "/")) 
            {
                res.add(s);
            }
        }
        return res;
    }
}
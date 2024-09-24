class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> al = new ArrayList<>();
        ArrayList<Integer> x=new ArrayList<>();
        for(int i:target) x.add(i);
        int max=target[target.length-1];
        ArrayList<Integer> x1=new ArrayList<>();
        for(int i=1;i<=max;i++)
        {
            if(x.contains(i)) x1.add(i);
            else x1.add(-1);
        }
        // System.out.println(x1);
        for(int i=0;i<x1.size();i++)
        {
            if(x1.get(i)!=-1) al.add("Push");
            else{
                al.add("Push");
                al.add("Pop");
            }
        }
            return al;
    }
}
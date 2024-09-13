class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<ranges.length;i++)
        {
            int a= ranges[i][0];
            int b= ranges[i][1];
            for(int x=a;x<=b;x++) al.add(x);
        }
        for(int i=left;i<=right;i++)
        {
            if(al.indexOf(i)==-1) return false;
        }
        return true;
    }
}
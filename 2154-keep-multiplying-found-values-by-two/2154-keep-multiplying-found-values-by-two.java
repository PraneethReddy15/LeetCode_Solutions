class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums) al.add(i);
        if(!al.contains(original)) return original;
        int n=original;
        while(al.contains(n))
        {
            n=2*n;
        }
        return n;
    }
}
class Solution {
    public boolean check(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        if(nums.length==1) return true;
        int count=1,max=0;
        for(int i : nums) al.add(i);
        for(int i : nums) al.add(i);
        System.out.println(al);
        int x=0;
        for(int i=0;i<al.size()-1;i++)
        {
            int a=al.get(i);
            int b=al.get(i+1);
            if(a<b){
                count++;
                max=Math.max(max,count);
            }
            else if(a==b && x<nums.length-1)
            {
                count++;
                x++;
                max=Math.max(max,count);
            }
            else{
                count=1;
            }
        }
        System.out.println(max);
        return max==nums.length;
    }
}
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        ArrayList<Integer> left=new ArrayList<>();
        ArrayList<Integer> mid=new ArrayList<>();
        int length=0;
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                arr[x++]=nums[i];
            }
            else if(nums[i]==pivot)
            {
                mid.add(nums[i]);
            }
            else{
                left.add(nums[i]);
            }
        }
        // System.out.println(mid);
        int p=0;
        if(mid.size()>0)
        {
            for(int i=x;i<=nums.length && p<mid.size();i++)
            {
                arr[i]=mid.get(p);
                p++;
                x++;
            }
        }
        int y=0;
        if(left.size()>0){
            for(int i=x;i<=nums.length && y<left.size();i++)
            {
                arr[i]=left.get(y);
                y++;
            }
        }
        return arr;
    }
}
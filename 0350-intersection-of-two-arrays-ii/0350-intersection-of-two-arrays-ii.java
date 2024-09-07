class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq1[]=new int[1001];
        int freq2[]=new int[1001];
        for(int i : nums1)
        {
            freq1[i]++;
        }
        for(int i : nums2)
        {
            freq2[i]++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(freq1[i]<=freq2[i] || freq2[i]<=freq1[i] && freq1[i]!=0 && freq2[i]!=0) {
                int count=Math.min(freq1[i],freq2[i]);
                while(count--!=0){
                    al.add(i);
                }
            }
        }
        System.out.println(al);
        int x=0;
        int arr[]=new int[al.size()];
        for(int i : al)
        {
            arr[x++]=i;
        }
        return arr;

        

    }
}
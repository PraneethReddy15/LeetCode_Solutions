class Solution {
    public int[] constructRectangle(int area) {
        int max=-1;
        for(int i=1;i*i<=area;i++)
        {
            if(area%i==0){
                if(i>max) max=i;
            }
        }
        int length=area/max;
        return new int[]{length,max};
    }
}
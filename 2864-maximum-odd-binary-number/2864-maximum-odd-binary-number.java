class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[s.length()];
        int oneCount=0;
        for(char i:s.toCharArray())
        {
            if(i=='1') oneCount++;
        }
        int x=0;
        while(oneCount>1)
        {
            arr[x++]=1;
            if(oneCount==1) break;
            oneCount--;
        }
        arr[arr.length-1]=1;
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
class Solution {
    public boolean isCircularSentence(String sentence) {
        String arr[]=sentence.split(" ");
        if(arr.length==1)
        {
            return arr[0].charAt(arr[0].length()-1)==arr[0].charAt(0);
        }
        else if(arr[0].charAt(0) != arr[arr.length-1].charAt((arr[arr.length-1]).length()-1)){
            return false;
        }
        for(int i=1;i<arr.length;i++)
        {
            String s1=arr[i-1];
            String s2=arr[i];
            // System.out.println(s1.charAt(s1.length()-1)+" "+s2.charAt(0));
            if(s1.charAt(s1.length()-1)!=s2.charAt(0)) return false;
            
        }
        return true;
    }
}
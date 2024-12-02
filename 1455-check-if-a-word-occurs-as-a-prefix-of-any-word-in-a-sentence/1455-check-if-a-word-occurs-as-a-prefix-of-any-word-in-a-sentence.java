class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        String arr[]=sentence.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            if(s.startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}
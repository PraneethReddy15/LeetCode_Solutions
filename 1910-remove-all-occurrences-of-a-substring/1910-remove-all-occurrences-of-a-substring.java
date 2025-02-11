class Solution {
    public String removeOccurrences(String s, String part) {
        // if(!s.contains(part)) return s;
        int indexOf=s.indexOf(part);
         while(indexOf != -1){
            s = s.substring(0,indexOf) + s.substring(indexOf + part.length(), s.length());
            indexOf = s.indexOf(part);
        }
        return s;
    }
}
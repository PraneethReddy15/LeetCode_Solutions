class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        
        while (!word.isEmpty()) {
            char c = word.charAt(0);
            int count = 0;

            for (int i = 0; i < word.length() && word.charAt(i) == c && count < 9; i++) {
                count++;
            }
            comp.append(count).append(c);
            word = word.substring(count);
        }
        
        return comp.toString();
    }
}

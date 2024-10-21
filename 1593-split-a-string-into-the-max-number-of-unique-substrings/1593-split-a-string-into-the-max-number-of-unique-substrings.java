import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(s, 0, new HashSet<>());
    }

    private int backtrack(String s, int start, Set<String> seen) {
        if (start == s.length()) {
            return seen.size();
        }

        int maxSplit = 0;
        for (int i = start + 1; i <= s.length(); i++) {
            String substring = s.substring(start, i);
            if (!seen.contains(substring)) {
                seen.add(substring);
                maxSplit = Math.max(maxSplit, backtrack(s, i, seen));
                seen.remove(substring);
            }
        }
        return maxSplit;
    }
}

class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor=1;
        for(int i : derived) xor^=i;
        return xor==1;
    }
}
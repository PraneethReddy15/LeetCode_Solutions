// class Solution {
//     public int longestSquareStreak(int[] nums) {
//         int max=-1,Omax=-1;
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++)
//         {
//             HashSet<Double> al = new HashSet<>();
//             al.add((double)nums[i]);
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(al.contains(Math.sqrt(nums[j]))) al.add((double)nums[j]);
//             }
//             // System.out.println(al);
//             Omax=Math.max(Omax,al.size());
//         }
//         return Omax==1?-1:Omax;
//     }
// }

class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> streaks = new HashMap<>();
        int maxStreak = -1;
        for (int num : nums) 
        {
            int sqrtNum = (int) Math.sqrt(num);
            if (sqrtNum * sqrtNum == num && streaks.containsKey(sqrtNum)) 
            {
                streaks.put(num, streaks.get(sqrtNum) + 1);
            } 
            else 
            {
                streaks.put(num, 1);
            }
            maxStreak = Math.max(maxStreak, streaks.get(num));
        }
        
        return maxStreak==1?-1:maxStreak;
    }
}

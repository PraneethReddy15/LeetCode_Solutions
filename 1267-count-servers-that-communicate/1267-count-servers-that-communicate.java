// class Solution {
//     public int countServers(int[][] grid) {
//         int countServer=0,count=0;
//         for(int i=0;i<grid.length;i++)
//         {
//             for(int j=0;j<grid[i].length;j++)
//             {
//                 if(grid[i][j]==1) countServer++;
//             }
//         }
//         Set<Integer> s = new HashSet<>();
//         for(int i=0;i<grid.length;i++)
//         {
//             int Ocunt=0,index=-1;
//             for(int j=0;j<grid[i].length;j++)
//             {
//                 if(grid[i][j]==1){
//                     Ocunt++;
//                     index=j;
//                 }
//             }
//             if(Ocunt==1)
//             {
//                 count++;
//                 s.add(index);
//             }
//         }
//         for(int i=0;i<grid[0].length;i++)
//         {
//             int Ocunt=0,index=-1;
//             for(int j=0;j<grid.length;j++)
//             {
//                 if(grid[j][i]==1){
//                     Ocunt++;
//                     index=j;
//                 }
//             }
//             if(Ocunt==1)
//             {
//                 if(s.contains(index))count--;
//                 else{
//                     count++;
//                     s.add(index);
//                 }
//             }
//         }
//         // System.out.println(count);
//         // System.out.println(countServer);
//         // System.out.println(s);
//         if(count==countServer) return count;
//         if(count<0) return countServer;
//         return (count+countServer)-s.size();
//     }
// }
class Solution {
    public int countServers(int[][] grid) {
        int totalServers = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];

        // Count the number of servers in each row and column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                    totalServers++;
                }
            }
        }

        // Subtract isolated servers
        int isolatedServers = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    isolatedServers++;
                }
            }
        }

        return totalServers - isolatedServers;
    }
}

// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
//         Map<Integer,Integer>  m=new TreeMap<>();
//         int arr[]=new int[2];
//         for(int i=0;i<grid.length;i++)
//         {
//             for(int j=0;j<grid[0].length;j++)
//             {
//                 m.put(grid[i][j],m.getOrDefault(grid[i][j],0)+1);
//             }
//         }
//         // System.out.print(m);
//         int x=grid.length*grid.length;
//         for(int i=1;i<=x;i++)
//         {
//             if(!m.containsKey(i)) arr[1]=i;
//         }
//         for(Map.Entry<Integer,Integer> entry:m.entrySet()){
//             if(entry.getValue()==2){
//                 arr[0]=entry.getKey();
//             }
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n= grid.length;
      int len=n*n;
      int [] count=new int[len+1];
      for(int [] row:grid)
      {
        for(int num:row)
        {
            count[num]++;
        }
      }
      int r =-1;
      int m=-1;
      for(int i=1;i<=len;i++){
        if(count[i]==2) r=i;
        if(count[i]==0) m=i;
      }
      return new int[]{r,m};

    }
}
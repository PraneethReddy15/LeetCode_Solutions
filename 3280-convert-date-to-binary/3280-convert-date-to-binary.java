class Solution {
    public String convertDateToBinary(String date) {
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        // System.out.println(year +" "+month+" "+day);
        StringBuilder res=new StringBuilder();
        res.append(binary(year));
        res.append("-");
        res.append(binary(month));
        res.append("-");
        res.append(binary(day));
        return res.toString();
    }
    static String binary(int n)
    {
        StringBuilder sb = new StringBuilder();
        while(n!=0)
        {
            int rem=n%2;
            sb.append(rem);
            n/=2;
        }
        return sb.reverse().toString();
    }
}
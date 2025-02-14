import java.util.*;

class ProductOfNumbers {
    ArrayList<Integer> al ;
    public ProductOfNumbers() {
        al=new ArrayList<>();
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
        int pro=1;
        for(int i=al.size()-1;i>=al.size()-k;i--)
        {
            pro*=al.get(i);
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
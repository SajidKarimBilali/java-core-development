package DSASeries;

public class productandsumofarray {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4,5};
        int sum =0;
        int prodcut=1;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            prodcut*=nums[i];
        }
        System.out.println("sum of elements "+sum);
        System.out.println("product of elements "+prodcut);
    }
}

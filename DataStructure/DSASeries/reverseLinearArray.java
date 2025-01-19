package DSASeries;

public class reverseLinearArray {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5, 6, 7 };
        // int size = nums.length;
        // System.out.println(size-1);
        for (int i = nums.length-1 ; i <nums.length; i--) {
            System.out.println(nums[i]);
        }
    }

}

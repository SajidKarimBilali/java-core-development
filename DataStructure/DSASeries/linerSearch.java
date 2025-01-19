package DSASeries;

public class linerSearch {

    static int searchValue(int nums[], int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 6, 8, 9, 5, 4 };
        int target = 9;
        int answer = searchValue(nums, target);
        System.out.println("index is : "+answer);
    }

}

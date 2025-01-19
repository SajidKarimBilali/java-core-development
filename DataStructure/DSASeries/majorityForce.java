package DSASeries;

public class majorityForce {
    static void bruteForceMethod(int nums[]) {
        //int n = nums.length;
        int freq = 0;
        int ans = 0;
        // for (int i : nums) {

        //     for (int j : nums) {
        //         if (i == j) {
        //             freq++;
        //         }
        //     }
        //     if (freq > n / 2) {

        //         System.out.println("value is " + freq);
        //     }
        // }

        //more iptemized
         for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                ans = i;
            }
            //int val = nums[i];
            if (ans == i) {
                freq++;
            }
            else
            {
                freq--;
            }
         }
         System.out.println("Majority Element is "+freq);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 2, 2 };
       // int target = 9;
        bruteForceMethod(nums);
    }
}

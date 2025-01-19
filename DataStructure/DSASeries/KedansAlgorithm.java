package DSASeries;

public class KedansAlgorithm {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        // for (int st = 0; st < nums.length; st++) {
        //     for (int end = st; end < nums.length; end++) {
        //         for (int j = st; j <=end; j++) {
        //              System.out.print(nums[j]);                    
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //Kadans Approach
        int cs=0;
        int mx=0;
        for (int i = 0; i < nums.length; i++) {
            cs=+nums[i];
            mx = Math.max(cs, mx);
            if (cs <0) {
                cs =0;
            }
        }

        System.out.println("max sum of subArray "+ mx);
    }
}

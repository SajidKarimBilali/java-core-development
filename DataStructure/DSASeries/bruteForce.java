package DSASeries;

public class bruteForce {

static void bruteForceMethod(int nums[],int target)
{

    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            int sum = nums[i]+nums[j];
            if (sum == target ) {
                System.out.println("indexes is : "+i+", "+j);
                System.out.println("sum is : "+sum+", "+target);
            }
        }
    }
}

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target=9;
        bruteForceMethod(nums,target);
    }
}
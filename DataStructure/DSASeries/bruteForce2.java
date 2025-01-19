package DSASeries;

public class bruteForce2 {
    static void bruteForceMethod(int nums[],int target)
    {
        int n = nums.length;
        int i=0;
        int j=n-1;
        while (i <j) {
            int ps = nums[i]+nums[j];
            if (ps>target) {
                j--;
            }
            else if (ps<target) {
                i++;
            } else {
                System.out.println("Answer is "+i+", "+j);
                break;
            }

        }
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target=9;
        bruteForceMethod(nums,target);
    }
    
}

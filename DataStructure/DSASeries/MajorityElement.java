package DSASeries;

public class MajorityElement {
    
    // Majority element dhoondhne ka function
    static int count = 0;  // Candidate ke liye count
        public static int majorityElement(int[] nums) {
            int candidate = -1;  // Candidate ko initialize karna
    
            // Step 1: Candidate choose karna
            for (int num : nums) {
                if (count == 0) {
                candidate = num;  // Naya candidate chunna
            }
            //count += (num == candidate) ? 1 : -1;  // Agar same element hai toh count badhayein, nahi toh kam karein
            if (num == candidate) {
                count++;  // Increment the count if num is the same as candidate
            } else {
                count--;  // Decrement the count if num is different from candidate
            }
        }

        // Step 2: Candidate ko verify karna
        count = 0;  // Candidate ka count reset karna
        for (int num : nums) {
            if (num == candidate) {
                count++;  // Agar candidate milta hai toh count barhao
            }
        }

        // Agar candidate array mein zyada than n/2 baar hai toh woh majority element hai
        if (count > nums.length / 2) {
            return candidate;  // Majority element return karo
        } else {
            return -1;  // Agar majority element nahi hai toh -1 return karo
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4,4};  // Example array
        int result = majorityElement(nums);

        if (result != -1) {
            System.out.println("Majority Element: " + result +" occurance "+count);
        } else {
            System.out.println("No Majority Element");
        }
    }
}



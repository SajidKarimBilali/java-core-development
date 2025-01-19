package DSASeries;

public class uniqueValue {
    public static int findUniqueNumber(int[] arr) {
        int result = 0;
        
        // XOR all elements in the array
        for (int num : arr) {
            result ^= num;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 3, 2, 1, 1}; // Example array
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println("The unique number is: " + uniqueNumber);
    }
}

package DSASeries;

public class Arrays_01 {

    public static void main(String[] args) {
        
        int array [] = {12,34,45,23,-4,-6};
        int smallest = 0;
        int largest =0;
        System.out.println(smallest);
        for (int i = 0; i < array.length; i++) {
            
            if (array[i]< smallest) {
                smallest = array[i];
            }
            if (array[i]> largest) {
                largest = array[i];
            }
        }
        System.out.println("Smallest Value is: "+smallest);
        System.out.println("Largest Value is: "+largest);
    }


    
}

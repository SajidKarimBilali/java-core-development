package DSASeries;

public class DsaPattern3 {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 1; j <i+1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // FOR ABC

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 1; j <i+1; j++) {
                System.out.print(ch);
                ch = (char) (ch + 1) ;
            }
            System.out.println();
        }
    }
}

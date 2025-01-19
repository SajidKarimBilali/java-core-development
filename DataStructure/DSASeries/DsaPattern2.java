package DSASeries;

public class DsaPattern2 {
    public static void main(String[] args) {
        char  n =70;
        for (char i = 65; i < n; i++) {
            for (char j = 65; j <i+1; j++) {
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}

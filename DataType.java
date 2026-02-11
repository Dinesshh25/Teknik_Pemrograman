import java.util.Scanner;
import java.math.BigInteger;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());
        BigInteger[] n = new BigInteger[T];


        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine().trim();
            n[i] = new BigInteger(input);
        }

        for (int i = 0; i < T; i++) {

            BigInteger A = n[i];
            boolean Tipe = false;

            if (A.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || A.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(A + " can't be fitted anywhere.");
                continue;
            }

            System.out.println(A + " can be fitted in:");

            if (A.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && A.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                System.out.println("* byte");
                Tipe = true;
            }

            if (A.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && A.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                System.out.println("* short");
                Tipe = true;
            }

            if (A.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && A.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println("* int");
                Tipe = true;
            }

            if (A.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&A.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("* long");
                Tipe = true;
            }
        }

        scanner.close();
    }
}

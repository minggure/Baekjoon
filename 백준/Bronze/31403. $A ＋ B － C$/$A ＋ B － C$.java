import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        int C = scan.nextInt();

        int numA = Integer.parseInt(A);
        int numB = Integer.parseInt(B);
        System.out.println(numA + numB - C);

        String AB = A + B;
        int numAB = Integer.parseInt(AB);
        System.out.println(numAB - C);
        }

    }




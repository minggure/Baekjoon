import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = 0;
        int W = 0;
        int N = 0;
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            H = scan.nextInt();
            W = scan.nextInt();
            N = scan.nextInt();

            int floor = N % H;
            int room = (N / H) + 1;

            if (floor == 0) {
                floor = H;
                room = N / H;
            }


            System.out.println(floor * 100 + room);
        }
    }
}
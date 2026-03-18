import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int score = 0;
            String ox = scan.next();
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    sum++;
                    score += sum;
                } else {
                    sum = 0;

                }
            }
            System.out.println(score);
        }
    }
}
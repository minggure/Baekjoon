import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;
        for(int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            result += num*num;
        }
        System.out.println(result%10);
    }
}




import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int num = 0;
        int total = 0;

        for(int i = 0; i < T; i++){
            boolean isPrime = true;
            num = scan.nextInt();
            if(num == 1){
                continue;
            }

            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime == true){
                total++;
            }

        }
        System.out.println(total);


    }
}
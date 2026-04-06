import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int N = scan.nextInt();
        for(int i = 1; i < N; i++){
            int number = i;
            int sum = i;

            while(number > 0){
                sum += number % 10;
                number /= 10;

            }
            if(sum == N){
                result = i;
                break;
            }

        }
        System.out.println(result);
    }
}
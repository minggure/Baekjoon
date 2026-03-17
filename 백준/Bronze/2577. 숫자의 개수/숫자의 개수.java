import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int count = 0;
        int multiply = A*B*C;
        int[] array = new int[10];
        while(multiply > 0){
           count = multiply % 10;
           array[count] += 1;
           multiply = multiply / 10;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }

    }
}
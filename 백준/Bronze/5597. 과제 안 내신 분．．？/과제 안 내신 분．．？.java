import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[] array = new boolean[31];
        int num = 0;


        for(int i = 0; i < 28; i++){
            num = scan.nextInt();
            array[num] = true;
        }
        for(int i = 1; i <= 30; i++){
            if(!array[i]){
                System.out.println(i);
            }
        }







    }
}
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxrow = 0;
        int cols = 0;
        int[][] array = new int[9][9];
        int max = 0;
        int maxlow = 0;



        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = scan.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxrow = i;
                    maxlow = j;

                }

            }

        }
        System.out.println(max);
        System.out.println((maxrow+1)+ " "+ (maxlow+1));
    }
}




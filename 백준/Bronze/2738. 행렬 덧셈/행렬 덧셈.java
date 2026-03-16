import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = 0;
        int cols = 0;
        row = scan.nextInt();
        cols = scan.nextInt();
        int[][] array = new int[row][cols];
        int[][] array2 = new int[row][cols];
        int[][] array3 = new int[row][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < cols; j++) {
                array2[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < cols; j++) {
                array3[i][j] = array2[i][j] + array[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

    }
}


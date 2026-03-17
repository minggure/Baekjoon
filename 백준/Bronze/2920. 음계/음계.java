import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String status = "";
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        if (array[0] == 1) {
            status = "ascending";
            for (int i = 0; i < 7; i++) {
                if (array[i + 1] != array[i] + 1) {
                    status = "mixed";
                    break;
                }
            }

                    }
        else if (array[0] == 8) {
            status = "descending";
            for (int i = 0; i < 7; i++) {
                if (array[i + 1] != array[i] - 1) {
                    status = "mixed";
                    break;


                }
            }
        }
        else{
            status = "mixed";
        }
        System.out.println(status);
    }
}
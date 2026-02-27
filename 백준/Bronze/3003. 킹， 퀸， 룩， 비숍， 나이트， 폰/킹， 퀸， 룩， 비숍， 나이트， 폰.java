import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] my = new int[6];
            int[] standard = {1,1,2,2,2,8};

            for(int i = 0; i < 6; i++){
                my[i] = sc.nextInt();
                System.out.print((standard[i] - my[i]) + " ");
            }


        }

        }

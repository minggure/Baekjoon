import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int star = sc.nextInt();

            for(int i = 1; i <= star; i++){
                for (int j = 0; j < star - i; j++){
                    System.out.print(" ");
                }
                for (int j= 0; j < 2 * i - 1; j++){
                    System.out.print("*");
                }
                System.out.println();

                }
            for (int i = star - 1; i >= 1; i--) {
            
                for (int j = 0; j < star - i; j++) {
                System.out.print(" ");
            }
          
                for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

            }
            }

        }


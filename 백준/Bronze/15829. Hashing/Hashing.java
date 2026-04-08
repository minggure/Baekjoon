import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String  alph = scan.next();

        long result = 0;
        long pow = 1;
        int M = 1234567891;

        for(int i = 0; i < N; i++){
            int a = alph.charAt(i) - 'a' + 1;

            result = (result + a * pow) % M;

            pow = (pow * 31) % M;

            }
        System.out.println(result);
        }

        }


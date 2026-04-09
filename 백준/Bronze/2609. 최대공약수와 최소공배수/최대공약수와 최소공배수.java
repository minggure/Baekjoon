import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int gcd = getGcd(a,b);
        int lcm = (a * b) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);


        }
        public static int getGcd(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
        }


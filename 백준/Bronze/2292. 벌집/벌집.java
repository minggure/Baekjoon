import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int count = 1;
        int N = scan.nextInt();
        if(N == 1){
            System.out.println(1);
        }
        else{
            while(num < N){
                num = num + (count * 6);
                count++;
            }
            System.out.println(count);
        }
        scan.close();
    }
}
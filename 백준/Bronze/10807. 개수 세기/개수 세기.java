import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int num[] = new int[n];

    for(int i = 0; i < num.length; i++){
        num[i] = scan.nextInt();
    }
    int result = scan.nextInt();
    int count = 0;
    for(int j = 0; j < num.length; j++){
        if(num[j] == result){
            count++;
        }
    }
        System.out.println(count);
    }
}
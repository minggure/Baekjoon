import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String[] number;

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int num = 666;
        int count = 1;

        while(count != N){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }

        }
        System.out.println(num);
    }
}

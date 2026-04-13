import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        

        int result = factorial(N) / (factorial(K) * factorial(N-K));

        System.out.println(result);

        }
    public static int factorial(int num){
        int res = 1;
        for(int i = 1; i <= num; i++){
            res *= i;
        }
        return res;
    }

}









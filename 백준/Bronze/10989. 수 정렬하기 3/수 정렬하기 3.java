import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] array = new int[T];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb);
        }





        }




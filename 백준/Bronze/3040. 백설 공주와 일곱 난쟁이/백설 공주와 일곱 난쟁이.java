import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
    static int N, M;
    static int[] number = new int[9];
    static int[] result = new int[7];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
;

        combination(0, 0, 0);

        System.out.println(sb);


        }

    private static void combination(int idx, int start, int sum) {
        if(idx == 7){
            if(sum == 100){
                for (int h : result){
                    sb.append(h).append("\n");
                }
                System.out.println(sb);
                System.exit(0);
            }
            return;

        }
        for(int i = start; i < 9; i++){
            result[idx] = number[i];
            combination(idx + 1, i + 1 , sum + number[i]);
        }

    }


}

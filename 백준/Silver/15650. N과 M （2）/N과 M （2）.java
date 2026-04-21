import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;


public class Main {
    static int N, M;
    static int[] number;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        number = new int[N];

        combination(0, 1);

        System.out.println(sb);


        }

    private static void combination(int numidx, int start) {

        if(numidx == M) {
            for(int i = 0; i < M; i++){
                sb.append(number[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i <= N; i++){
            number[numidx] = i;

            combination(numidx + 1, i + 1);
        }


    }

}

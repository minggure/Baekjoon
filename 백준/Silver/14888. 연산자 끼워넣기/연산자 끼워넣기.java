import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int N;
    static int[] number;
    static int[] operator = new int[4];
    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        number = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, number[0]);

        System.out.println(maxResult);
        System.out.println(minResult);
    }

    public static void dfs(int idx, int currentSum) {
        if (idx == N) {
            maxResult = Math.max(maxResult, currentSum);
            minResult = Math.min(minResult, currentSum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {

                operator[i]--;

                if (i == 0) {
                    dfs(idx + 1, currentSum + number[idx]);
                } else if (i == 1) {
                    dfs(idx + 1, currentSum - number[idx]);
                } else if (i == 2) {
                    dfs(idx + 1, currentSum * number[idx]);
                } else if (i == 3) { // 나누기
                    dfs(idx + 1, currentSum / number[idx]);
                }
                operator[i]++;
            }

        }


    }
}
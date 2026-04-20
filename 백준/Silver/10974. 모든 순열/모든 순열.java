import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static int N;
    static int[] number;
    static boolean[] isSelected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        number = new int[N];

        isSelected = new boolean[N + 1];

        permutation(0);

        System.out.println(sb);

}

    public static void permutation(int idx){
        if(idx == N){
            for (int i = 0; i < N; i++){
                sb.append(number[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= N; i++) {
            if(isSelected[i]) continue;

            number[idx] = i;
            isSelected[i] = true;
            permutation(idx + 1);
            isSelected[i] = false;
        }
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int sum = 0;
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = scan.nextInt();
        }
        int result = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = card[i] + card[j] + card[k];
                    if (M == sum) {
                        System.out.println(sum);
                        return;
                    }
                    if (sum < M && result < sum) {
                        result = sum;
                    }
                }
            }

        }
        System.out.println(result);
    }
}

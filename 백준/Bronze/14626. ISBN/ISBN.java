import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int totalSum = 0;   // 별표 제외한 총합
        int starPos = 0;    // 별표의 위치(인덱스)

        // 1. 먼저 전체를 돌면서 별표 위치 찾고, 나머지는 합산함
        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);

            if(ch == '*') {
                starPos = i; // 위치(i)를 저장!
            } else {
                int num = ch - '0';
                // i(인덱스)가 짝수면 *1, 홀수면 *3
                if(i % 2 == 0) totalSum += num * 1;
                else totalSum += num * 3;
            }
        }

        // 2. 이제 별표 자리에 0~9를 하나씩 넣어봄 (루프 밖에서!)
        for(int j = 0; j <= 9; j++) {
            int finalSum = totalSum;

            if(starPos % 2 == 0) finalSum += j * 1;
            else finalSum += j * 3;

            if(finalSum % 10 == 0) {
                System.out.println(j);
                break;
            }
        }
    }
}





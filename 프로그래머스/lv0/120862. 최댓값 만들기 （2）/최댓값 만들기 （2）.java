import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int n = numbers.length;
        int first = numbers[n - 1] * numbers[n - 2];
        int second = numbers[0] * numbers[1];

        answer = Math.max(first,second);
            return answer;
        }
    }


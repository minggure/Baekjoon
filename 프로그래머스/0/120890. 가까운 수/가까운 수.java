import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {

        Arrays.sort(array);

        int answer = array[0];
        int minDiff = Math.abs(array[0] - n);

        for(int i = 1; i < array.length; i++){
            int currenDiff = Math.abs(array[i] - n);

            if(currenDiff < minDiff){
                minDiff = currenDiff;
                answer = array[i];
            }
        }



        return answer;
    }
}
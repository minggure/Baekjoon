import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ");
        int[]array = new int[str.length];
        for(int i = 0; i < str.length; i++){
            array[i] = Integer.parseInt(str[i]);

        }
        Arrays.sort(array);
        return array[0] + " " + array[array.length - 1];
    }
}
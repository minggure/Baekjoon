import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lower = my_string.toLowerCase();

        char[] charArray = lower.toCharArray();


        Arrays.sort(charArray);


        return new String (charArray);
    }
}
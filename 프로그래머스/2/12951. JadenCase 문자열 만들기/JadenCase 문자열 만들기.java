import java.util.Locale;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ", -1);
        for(int i = 0; i < str.length; i++) {
            String word = str[i];
            
            if(word.length() > 0) {

                String tempFirst = word.substring(0, 1).toUpperCase();
                String tempLast = word.substring(1).toLowerCase();

                answer += tempFirst + tempLast;
            }
            if(i < str.length - 1){
                answer += " ";

            }

        }
        return answer;
    }
}
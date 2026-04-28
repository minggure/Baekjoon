import javax.management.StringValueExp;

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String setage = String.valueOf(age);

        for(int i = 0; i < setage.length(); i++){
            sb.append((char) (setage.charAt(i) - '0' + 'a'));


        }
        return sb.toString();
    }
}
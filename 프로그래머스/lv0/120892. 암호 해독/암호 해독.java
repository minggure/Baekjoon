class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for(int i = code; i <= cipher.length(); i += code){
            char ch = cipher.charAt(i - 1);
            answer.append(ch);
        }
        return answer.toString();
    }
}
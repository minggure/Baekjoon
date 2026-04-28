class Solution {
    public int solution(int hp) {
        int answer = 0;

        for(int i = 0; i < hp; i++) {
            answer += hp/5;
            hp %= 5;
            answer += hp/3;
            hp %= 3;
            answer += hp/1;
            hp %= 1;
            
        }
        return answer;
    }
}
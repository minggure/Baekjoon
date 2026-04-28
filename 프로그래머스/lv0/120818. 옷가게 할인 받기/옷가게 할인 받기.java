class Solution {
    public int solution(int price) {
        int answer = 0;
        double per = 0;
        if(price >= 500000){
            per = 0.20;
        }
        else if(price >= 300000) {
            per = 0.10;
        }
        else if(price >= 100000){
            per = 0.05;}

        answer = (int)(price - (price * per));


        return answer;
    }
}
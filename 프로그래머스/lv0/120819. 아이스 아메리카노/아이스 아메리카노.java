class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int amaricano = 5500;
      
        answer[0] += money / amaricano;
        answer[1] = money % amaricano;
        
        return answer;
    }
}
class Solution {
    public int solution(int order) {
        int answer = 0;
        String name = String.valueOf(order);

        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9'){
                answer++;
            }
        }


        return answer;
    }
}
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char ch = (char)(k + '0');

        for(int a = i; a <= j; a++){
            String s = String.valueOf(a);
            for(int l = 0; l < s.length(); l++){
                if(s.charAt(l) == ch){
                    answer++;
                }
            }

        }
        return answer;
    }
}
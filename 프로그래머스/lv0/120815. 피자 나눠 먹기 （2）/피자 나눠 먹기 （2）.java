class Solution {
    public int solution(int n) {
        int pizzaPan = 1;
        
        while ((pizzaPan * 6) % n != 0) {
            pizzaPan++;
        }

        return pizzaPan;
    }
}
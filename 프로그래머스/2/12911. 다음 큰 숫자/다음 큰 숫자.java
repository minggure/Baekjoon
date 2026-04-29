class Solution {
    public int solution(int n) {
        int targetCount = Integer.bitCount(n);
        int nextNum = n + 1;
        while (true) {

            if (Integer.bitCount(nextNum) == targetCount) {
                return nextNum; 
            }


            nextNum++;
        }
    }
}
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int y = n / 10;
        int c = k - y;
        return 12000 * n + 2000 * c;
    }
}
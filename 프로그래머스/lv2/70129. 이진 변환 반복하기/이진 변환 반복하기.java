class Solution {
    public int[] solution(String s) {
        int totalCount = 0;
        int zeroNum = 0;


        while(!s.equals("1")){
            int line = s.length();
            s = s.replace("0","");
            int lastline = s.length();

            zeroNum += (line - lastline);

            s = Integer.toBinaryString(lastline);

            totalCount++;

        }
        return new int[] {totalCount,zeroNum};
    }
}
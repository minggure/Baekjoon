import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
           //배열을 일단 문자열로 만들고 "" 안으로 하나씩 나누어줌
        // ex) 118372 -> ("1","1","8","3","7","2")
        Arrays.sort(arr,Collections.reverseOrder());
        // 내림차순으로 바꿈 ("8","7","3","2","1","1")
        String answer = String.join("",arr);
        //join 을 이용하여 "" 구분을 없애줌
        return Long.parseLong(answer);
        // long 타입으로 다시변환하여 반환
    }
}
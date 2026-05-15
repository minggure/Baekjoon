import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 1. 귤 크기별로 개수 세기 (HashMap 사용)
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        // 2. 개수(Value)들만 따로 뽑아서 리스트 만들기
        List<Integer> list = new ArrayList<>(map.values());
        
        // 3. 개수가 많은 순서(내림차순)로 정렬하기
        list.sort(Collections.reverseOrder());

        // 4. 큰 놈부터 박스에 담기
        int sum = 0;    // 지금까지 담은 귤의 총 개수
        int answer = 0; // 담은 귤의 종류 수
        
        for (int count : list) {
            answer++;    // 종류 하나 추가!
            sum += count; // 개수 더하기
            
            if (sum >= k) break; // 목표 k개를 채웠으면 그만!
        }
        
        return answer;
    }
}
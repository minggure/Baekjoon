import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
            q.add(new int[]{priorities[i], i});
        }
        int answer = 0;

        while (!q.isEmpty()) {
            int[] current = q.poll();

            // 1. 내가 지금 대장인가?
            if (current[0] == pq.peek()) {
                answer++;      // 실행 횟수 추가
                pq.poll();     // 장부에서 지우기 (이제 이 숫자는 세상에 없음)

                // 2. 내가 찾던 그 녀석인가?
                if (current[1] == location) {
                    return answer; // 맞으면 바로 종료!
                }
                // 대장이 맞아서 실행됐으므로, 큐에 다시 넣지 않고 그대로 소멸합니다.
            } else {
                // 3. 내가 대장이 아니네? 그럼 다시 뒤로 가서 줄 서야지.
                q.add(current);
            }
        }
        return answer;
        }
    }

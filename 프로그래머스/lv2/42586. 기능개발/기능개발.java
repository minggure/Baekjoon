import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            int days = 100 - progresses[i];

            int num = days / speeds[i];
            if(days % speeds[i] != 0){
                num++;
            }
            q.offer(num);
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            int reader = q.poll();
            int count = 1;
            
            while(!q.isEmpty() && q.peek() <= reader){
                q.poll();
                count++;
            }
            result.add(count);
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++){
                q.add(0);
        }
        int truckIdx = 0;
        while(truckIdx < truck_weights.length){
            answer++;
            currentWeight -= q.poll();
            if(currentWeight + truck_weights[truckIdx] <= weight){
                q.add(truck_weights[truckIdx]);
                currentWeight += truck_weights[truckIdx];
                truckIdx++;
            }else {
                q.add(0);
            }



        }
        answer += bridge_length;

        return answer;
    }
}
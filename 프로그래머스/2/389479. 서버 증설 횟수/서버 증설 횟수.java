class Solution {
    public int solution(int[] players, int m, int k) {

        int answer = 0;
        int currentServerCount = 0;
        
        int [] expireCount = new int[players.length + k];
        
        for(int i = 0; i < players.length; i++){
            currentServerCount -= expireCount[i];
            
            int requiredServer = players[i] / m;
            
            if(currentServerCount < requiredServer){
                int buyConut = requiredServer - currentServerCount;
                
                answer +=buyConut;
                currentServerCount += buyConut;
                
                expireCount[i + k] += buyConut;
            }
        }
        return answer;
    }
}
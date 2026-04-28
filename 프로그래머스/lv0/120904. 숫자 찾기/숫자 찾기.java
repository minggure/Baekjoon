class Solution {
    public int solution(int num, int k) { 
      
        String s = String.valueOf(num);
       
        String target = String.valueOf(k);

       
        int index = s.indexOf(target);
        
        if (index == -1) {
            return -1;
        } else {
            return index + 1;
        }
    }
}
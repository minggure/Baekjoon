import java.util.LinkedHashSet;
import java.util.LinkedList;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        LinkedHashSet<Character> list = new LinkedHashSet<>();

        for (char c : my_string.toCharArray()) {
            list.add(c);
        }
        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();

    }
}

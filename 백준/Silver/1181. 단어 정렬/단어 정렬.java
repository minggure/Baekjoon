import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static String[] number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }


        });
        for(int i = 0; i < N; i++){
            set.add(br.readLine());

        }
        StringBuilder sb = new StringBuilder();
        for(String s : set){
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    static int n;
    static String passWord;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> cursor = list.listIterator();

            for (int j = 0; j < input.length(); j++) {
                char cmd = input.charAt(j);
                switch (cmd) {
                    case '<':
                        if (cursor.hasPrevious()) {
                            cursor.previous();
                        }
                        break;
                    case '>':
                        if (cursor.hasNext()) {
                            cursor.next();
                        }
                        break;
                    case '-':
                        if (cursor.hasPrevious()) {
                            cursor.previous();
                            cursor.remove();
                        }
                        break;
                    default:
                        cursor.add(cmd);
                        break;

                }
            }

            for (char ch : list) {
                sb.append(ch);
            }
            sb.append(" ");


        }
        System.out.println(sb.toString());

    }
}
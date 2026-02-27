import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String alph = sc.next().toUpperCase();
            int[] array = new int[26];

            for(int i = 0; i < alph.length(); i++){
                char alphbet = alph.charAt(i);
                int index = alphbet -'A';
                array[index]++;
            }
            int max = -1;
            char result = '?';

            for(int i = 0; i < 26; i++){
                if(array[i] > max){
                    max = array[i];
                    result = (char) (i + 'A');
                }
                else if(array[i] == max){
                    result = '?';
                }

            }
        System.out.println(result);
            }

        }


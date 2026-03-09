import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            int count = 0; //그룹 단어를 셀 변수

            for(int i = 0; i < index; i++){
                String word = sc.next();
                if(checkGroupword(word)){
                    count++;
                }
            }
            System.out.println(count);
                }
                public static boolean checkGroupword(String str){
                    boolean[] check = new boolean[26];
                    int prev = 0;

                    for(int j = 0; j < str.length(); j++){
                        int now = str.charAt(j);

                        if(prev != now){
                            if(!check[now - 'a']){
                                check[now - 'a'] = true;
                                prev = now;
                            }
                            else {
                                return false;
                            }
                        }


            }
                    return true;

            }

        }


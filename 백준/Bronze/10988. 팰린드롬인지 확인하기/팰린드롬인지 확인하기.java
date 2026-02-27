import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String pal = sc.next();
            StringBuffer sb = new StringBuffer(pal);
            String revers = sb.reverse().toString();
            if(pal.equals(revers)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
            }

        }


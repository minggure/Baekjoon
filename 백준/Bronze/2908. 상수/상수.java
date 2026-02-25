import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();
        StringBuffer sb = new StringBuffer(num1);
        StringBuffer sb2 = new StringBuffer(num2);
        String revers = sb.reverse().toString();
        String revers2 = sb2.reverse().toString();

        int intValue1 = Integer.parseInt(revers);
        int intValue2 = Integer.parseInt(revers2);


        if (intValue1 > intValue2) {
            System.out.println(intValue1);
        } else {
            System.out.println(intValue2);


        }
    }
}
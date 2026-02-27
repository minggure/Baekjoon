import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String alph = sc.next();
            String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

            for(int i = 0; i < croatia.length; i++ ){
                alph = alph.replace(croatia[i], "*");


            }
        System.out.println(alph.length());

            }

        }


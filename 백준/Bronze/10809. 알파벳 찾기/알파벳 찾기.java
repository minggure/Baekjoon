import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alph = scan.next();

        int[] array = new int[26];
        Arrays.fill(array, -1);

            for(int i = 0; i < alph.length(); i++){
                char ch = alph.charAt(i);
                int index = ch - 'a';

                if(array[index] == -1){
                    array[index] = i;
                }

        }
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i]+" ");
            }
    }
}
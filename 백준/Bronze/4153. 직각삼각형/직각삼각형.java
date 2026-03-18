import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        

        while(true){
            array[0] = scan.nextInt();
            array[1] = scan.nextInt();
            array[2] = scan.nextInt();
            Arrays.sort(array);
            if(array[0] == 0 && array[1] == 0 && array[2] == 0){
                break;
            }
            if((array[0]*array[0]) + (array[1]*array[1]) == (array[2]*array[2])){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }




        }
    }
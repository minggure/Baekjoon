import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int huMan = scan.nextInt();
        int totalT = 0;
        int[] T = new int[6];
        for(int i = 0; i < T.length; i++){
            T[i] = scan.nextInt();  // 3,1,4,1,5,9
        }
        int tBuy = scan.nextInt();
        int penBuy = scan.nextInt();
        for(int i = 0; i < T.length; i++){
            if(T[i] % tBuy == 0){
                totalT += T[i] / tBuy;
            } else  {
                totalT += (T[i] / tBuy) + 1;
            }
        }
        System.out.println(totalT);
        System.out.println(huMan / penBuy +" "+ huMan % penBuy);






        }
    }
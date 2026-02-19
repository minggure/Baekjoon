import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        double[] score = new double[num];
        double max = score[0];
        double total = 0;
        for(int i = 0; i < score.length; i++){
            score[i] = scan.nextInt();
            for(int j = 0; j < score.length; j++){
                if(score[j] > max){
                    max = score[j];
                }

                }
            }
        for(int i = 0; i < score.length; i++){
            total += score[i]/ max * 100;
        }
        System.out.println(total / num);
    }
}
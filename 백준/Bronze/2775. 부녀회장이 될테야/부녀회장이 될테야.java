import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[15][15];
        for (int i = 1; i < 15; i++) {
            array[0][i] = i;

            }
        for(int i = 1; i < 15; i++){
            for(int j = 1; j < 15; j++){
                array[i][j] = array[i][j-1] + array[i-1][j];
            }

        }
        int T = scan.nextInt();
        for(int k = 0; k < T; k++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            System.out.println(array[i][j]);
        }
        scan.close();

    }
}


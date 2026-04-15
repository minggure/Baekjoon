import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());


        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

            }
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            int command = Integer.parseInt(st.nextToken());
            executeCommand(command);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }


    static void executeCommand(int command) {
        switch (command) {
            case 1:
                map = fun1();
                break;
            case 2:
                map = fun2();
                break;
            case 3:
                map = fun3();
                break;
            case 4:
                map = fun4();
                break;
            case 5:
                map = fun5();
                break;
            case 6:
                map = fun6();
                break;
        }
    }

    private static int[][] fun1() {
        int R = map.length; //전체 행 개수
        int C = map[0].length; //첫번째 행의 열 개수
        int[][] temp = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                temp[i][j] = map[R - 1 - i][j];
            }

        }
        return temp;
    }

    private static int[][] fun2() {
        int R = map.length;
        int C = map[0].length;
        int[][] temp = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                temp[i][j] = map[i][C - 1 - j];


            }

        }
        return temp;
    }

    private static int[][] fun3() {
        int R = map.length;
        int C = map[0].length;
        int[][] temp = new int[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                temp[j][R - 1 - i] = map[i][j];
            }
        }
        return temp;
    }

    private static int[][] fun4() {
        int R = map.length;
        int C = map[0].length;
        int[][] temp = new int[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                temp[C - 1 - j][i] = map[i][j];
            }
        }
        return temp;
    }

    private static int[][] fun5() {
        int R = map.length;
        int C = map[0].length;
        int halfR = R / 2;
        int halfC = C / 2;
        int[][] temp = new int[R][C];
        for (int i = 0; i < halfR; i++) {
            for (int j = 0; j < halfC; j++) {
                temp[i][j + halfC] = map[i][j];
                temp[i + halfR][j + halfC] = map[i][j + halfC];
                temp[i + halfR][j] = map[i + halfR][j + halfC];
                temp[i][j] = map[i + halfR][j];
            }
        }
        return temp;
    }

    private static int[][] fun6() {
        int R = map.length;
        int C = map[0].length;
        int halfR = R / 2;
        int halfC = C / 2;
        int[][] temp = new int[R][C];
        for (int i = 0; i < halfR; i++) {
            for (int j = 0; j < halfC; j++) {
                temp[i + halfR][j] = map[i][j];
                temp[i + halfR][j + halfC] = map[i + halfR][j];
                temp[i][j + halfC] = map[i + halfR][j + halfC];
                temp[i][j] = map[i][j + halfC];
            }
        }
        return temp;
    }
}




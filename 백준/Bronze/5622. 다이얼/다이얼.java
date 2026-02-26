import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTime = 0;
        String num1 = sc.nextLine();
        for(int i=0; i < num1.length(); i++){
            char ch = num1.charAt(i);
            if(ch == 'A' || ch == 'B' || ch == 'C'){
                totalTime += 3;
            }
            else if(ch == 'D' || ch == 'E' || ch == 'F'){
                totalTime += 4;
            }
            else if(ch == 'G' || ch == 'H' || ch == 'I'){
                totalTime += 5;
            }
            else if(ch == 'J' || ch == 'K' || ch == 'L'){
                totalTime += 6;
            }
            else if(ch == 'M' || ch == 'N' || ch == 'O'){
                totalTime += 7;
            }
            else if(ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S'){
                totalTime += 8;
            }
            else if(ch == 'T' || ch == 'U' || ch == 'V'){
                totalTime += 9;
            }
            else if(ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z'){
                totalTime += 10;
            }
        }
        System.out.println(totalTime);

    }
}
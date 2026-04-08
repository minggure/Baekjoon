import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String str = scan.next();
            if(str.equals("0")){
                break;
            }
            String revers = "";
            for(int i = str.length()-1; i >= 0; i--){
                revers = revers + str.charAt(i);
                }
                if(str.equals(revers)){
                    System.out.println("yes");

                }
                else{
                    System.out.println("no");
                }
            }

        }
        }


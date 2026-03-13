import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalSum = 0;    
        double totalCredit = 0; 

        for(int i = 0; i < 20; i++) {
            String subject = scan.next();      
            double credit = scan.nextDouble(); 
            String grade = scan.next();        

            if (grade.equals("P")) {
                continue;
            }

            double point = 0.0;
            switch (grade) {
                case "A+": point = 4.5; break;
                case "A0": point = 4.0; break;
                case "B+": point = 3.5; break;
                case "B0": point = 3.0; break;
                case "C+": point = 2.5; break;
                case "C0": point = 2.0; break;
                case "D+": point = 1.5; break;
                case "D0": point = 1.0; break;
                case "F":  point = 0.0; break;
            }

           
            totalSum += (credit * point);
            totalCredit += credit;
        }

        System.out.println(totalSum / totalCredit);

    
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        for(int i = 0; i < 3; i++){
            String s = scan.nextLine();
            if(!s.equals("FizzBuzz") && !s.equals("Fizz") && !s.equals("Buzz")){
               int realNumber =  Integer.parseInt(s);
               num = realNumber + (3 - i);
            }
        }
        if(num % 15 == 0){
            System.out.println("FizzBuzz");
        }
        else if(num % 3 == 0){
            System.out.println("Fizz");
        }
        else if(num % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }
    }



}
package classWorks;

import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {
        int numberOne =1;
        int numberZero = 0;
        Scanner input =  new Scanner(System.in);
        System.out.println( " enter number");
        int number =  input.nextInt();
        if( number ==1){
            number = numberZero;
        }
        if ( number == 0){
            number = numberOne;
        }
        else{
        }
        System.out.println(" enter a number: " + number);



        System.out.println( " chosen number is : " + number);





    }
}

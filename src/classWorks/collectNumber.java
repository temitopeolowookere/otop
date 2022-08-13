package classWorks;
// program to ask the user to input 5 random numbers one after tge other and u ask the computer to collate and determine the max
// and mnimum value without using array

import java.util.Scanner;

public class collectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
         int userInput = input.nextInt();

         int minNumber = userInput;
         int MaxNumber = userInput;

         for ( int count = 1; count <5; count++){

             int number = input.nextInt();
             if (number < minNumber) {
                 minNumber = userInput;
             }
             if ( number >MaxNumber){
                 MaxNumber = userInput;
             }

         }

        System.out.println( " minimum number is " + minNumber);
        System.out.println( " maximum number is " + MaxNumber);

    }
}

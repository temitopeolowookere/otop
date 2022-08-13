package classWorks;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter 5 random numbers");
        int userInput = input.nextInt();


         int largestNumber  = userInput;
         int lowestNumber  = userInput;

        int count = 1;
        while (count < 5) {
            userInput = input.nextInt();
            if (userInput < lowestNumber) {
                lowestNumber = userInput;
            }
            if (userInput > largestNumber) {
                largestNumber = userInput;
            }
            count++;

        }
        System.out.println( " the highest number is " + largestNumber);
        System.out.println(" the lowest number is "+ lowestNumber);
    }
}
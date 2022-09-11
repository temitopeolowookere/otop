package classWorks;

import java.util.Scanner;

public class NumberOfFactor {

    public int factors(int num) {
        int count = 0;
        for (int i = 1; i <=num; i++){
            if (num%i == 0)
                count++;

        }
        System.out.println(count);
        return count++;

    }


    public boolean prime(int primeNumber) {
        boolean numIsPrime;
        int count = 0;
        for (int i = 1; i <= primeNumber; i++){

            if (primeNumber % i == 0){
                count++;
            }

            if (count == 2){
                return numIsPrime = true;
            }


        }

        return numIsPrime = false;
    }
}



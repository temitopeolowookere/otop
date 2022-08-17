package classWorks;

import java.util.Scanner;

public class NumberOfFactor {

    public int factors(int num) {
        int count = 0;
        for (int i = 1; i <=num; i++){
            if (num%i == 0)
                count++;

        }
        return count++;


    }
}



import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        int score;
        String grade = null;

        Scanner input = new Scanner(System.in);
        for( int count = 1; count <=6 ; count ++){
            System.out.println( " Enter your score: ");
            score = input.nextInt();

            switch (score /10){
                case 9:
                    grade = " Grade A";
                    break;

                case 6:
                    grade = "Grade B";
                    break;

                case 5:
                    grade = " Grade C";
                    break;
                case 4:
                    grade = " Grade D";
                case 3:
                    grade = "Grade E";
                    break;
                case 2:
                    grade = "Grade F";
            }
//            System.out.println( "you scored: "+ 'score your grade is "+grade  );

        }




    }






}

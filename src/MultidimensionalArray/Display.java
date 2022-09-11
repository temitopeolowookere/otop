package MultidimensionalArray;

public class Display {
    public static void main(String[] args)
    {Displayer();
    }
    private static void Displayer(){
        String[][] array = {{"X", "O", "X"},
                {"O", "X", "O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"},
                {"X", "X", "O"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"},
                {"X", "O", "X"}

        };

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]);
                if (column < array.length - 1) {
                    System.out.print("|");
                }
            }
        }
            System.out.println();




    }
}



package classWorks.GraceAssignments.Array;
import java.util.Arrays;
import java.util.Random;
public class ShuffleArrayItems {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        Random shuffle = new Random();

        for (int i = 0; i < array.length; i++) {
            int randonSwap = shuffle.nextInt(array.length);
            int tempVariable= array[randonSwap];
            array[randonSwap] = array[i];
            array[i] = tempVariable;
        }
        System.out.println(Arrays.toString(array));
    }
}

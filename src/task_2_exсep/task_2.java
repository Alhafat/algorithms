package task_2_exсep;

import java.io.FileNotFoundException;

public class task_2 {
    //Задание 2
    public static void main(String[] args) throws Exception {

        try {
            int d = 0;
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}


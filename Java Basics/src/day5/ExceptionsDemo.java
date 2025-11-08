package day5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    static void main(String[] args) {
//        int a = 10;
//        int result = 10/0;
//        System.out.println("Done");

        try{
            int a = 10;
            int result = 10/0;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            FileReader fileReader = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        System.out.println("Done");

        int[] a = {1, 2, 3};
        try {
            System.out.println(a[2]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("EXCEPTION");
        } catch (ArithmeticException e) {

        } finally {
            // ALWAYS EXECUTES
            System.out.println("FINALLY");
        }
    }
}

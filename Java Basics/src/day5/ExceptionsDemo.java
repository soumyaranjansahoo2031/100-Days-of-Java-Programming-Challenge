package day5;

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

        System.out.println("Done");
    }
}

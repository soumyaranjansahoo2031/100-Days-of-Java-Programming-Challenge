package day3.constructors;

record Bike(String brand, int speed){}

public class RecordDemo {
    static void main() {
        Bike bike = new Bike("Honda",250);
        System.out.println(bike);
    }
}

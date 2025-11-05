package day3.constructors;

public class ConstructorsDemo {
    static void main() {
        Car car1 = new Car();

//        car1.speed = 200;
//        car1.brand = "BMW";
//        car1.color = "White";

        car1.drive();

        Car car2 = new Car("Tata","black",50);
        car2.drive();

        Car car3 = new Car("Hero Honda");
        car3.drive();

    }
}

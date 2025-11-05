package day3.p3_interfaces;

public class InterfaceDemo {
    static void main(String[] args) {
        CarControlls car1 = new ElectricCar();
        car1.turnLeft();

        CarControlls car2 = new SportsCar();
        car2.turnRight();
    }
}

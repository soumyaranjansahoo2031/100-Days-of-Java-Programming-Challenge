package day3.p3_interfaces;

public class ElectricCar implements CarControlls{
    @Override
    public void turnRight() {
        System.out.println("Electric Car is turning Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Car is turning Left");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Electric Car is applying brakes");
    }
}

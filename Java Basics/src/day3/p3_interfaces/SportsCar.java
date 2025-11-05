package day3.p3_interfaces;

public class SportsCar implements CarControlls{
    @Override
    public void turnRight() {
        System.out.println("Sports Car is turning Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports Car is turning Left");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Sports Car is applying brakes");
    }
}

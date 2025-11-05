package day3.p3_interfaces;

public interface CarControlls {
    void turnRight();
    void turnLeft();
    void applyBrakes();

     default void accelerate(){

    }
}

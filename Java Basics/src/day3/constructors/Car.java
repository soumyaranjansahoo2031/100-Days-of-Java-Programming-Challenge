package day3.constructors;

public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand+" is driving "+speed);
    }

}
//class abc{
//    static void main() {
//        Car car1 = new Car();
//        car1.speed=500;
//        car1.brand="kia";
//        car1.color="red";
//        car1.drive();
//    }
//}

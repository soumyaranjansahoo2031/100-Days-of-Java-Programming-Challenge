package day4;

import day3.constructors.Car;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main(String[] args) {
        List users = new ArrayList();
        users.add("Alice");
        users.add("1");
        users.add(1);

        System.out.println(users);

        List<String> users2 = new ArrayList<>();
        users2.add("Alice");
        users2.add("1");
//        users2.add(1);

        System.out.println(users);

        //List of objects
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Ford");
        List<Car> li = new ArrayList<>();
        li.add(car1);
        li.add(car2);
        for(Car c: li){
            System.out.println(c.getBrand());
        }
//        System.out.println(li);
    }

}

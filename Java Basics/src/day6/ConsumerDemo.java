package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    static void main(String[] args) {
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("I am the MASTER");

        Consumer<String> consumer2 = (s)-> System.out.println("length: "+s.length()+" ->string: "+s);
        consumer2.accept("I am the MASTER");

        List<Integer> numbers = Arrays.asList(7,9,16,29,2);
        Consumer<Integer> multiplyByTwo = x -> System.out.print(x*2+" ");
        numbers.forEach(multiplyByTwo);
        System.out.println();
        numbers.forEach(x-> System.out.print(x/2+9-7+" "));
    }
}

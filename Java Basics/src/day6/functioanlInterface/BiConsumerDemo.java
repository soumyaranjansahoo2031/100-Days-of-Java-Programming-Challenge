package day6.functioanlInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    static void main(String[] args) {

        BiConsumer<String,String> BiConsumer2 = (s,t)-> System.out.println(s+" "+t);
        BiConsumer2.accept("I am the MASTER","Believe in yourself");

        List<Integer> numbers = Arrays.asList(7,9,16,29,2);
        BiConsumer<Integer,Integer> multiplyBy = (x,y) -> System.out.print(x*y+" ");
//        numbers.forEach(multiplyBy);
//        System.out.println();
//        numbers.forEach(x-> System.out.print(x/2+9-7+" "));
    }
}

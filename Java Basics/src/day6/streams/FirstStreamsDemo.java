package day6.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstStreamsDemo {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // LIST: even numbers from "numbers" list
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) evenNumbers.add(num);
        }
        System.out.println(evenNumbers);

        //ITERATION 2
        Stream<Integer> integerStream1 = numbers.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p);
        List<Integer> li = integerStream2.toList();

        Stream<Integer> integerStream3 = numbers.stream();
        Stream<Integer> integerStream4 = integerStream3.filter(p2);
        List<Integer> li2 = integerStream4.toList();

        System.out.println(li);
        System.out.println(li2);
        System.out.println(numbers.stream().toList());

        //ITERATION 3
        List<Integer> list = numbers.stream()
                .filter(x->x%2==0)
                .map(x->x+1)
                .toList();
        System.out.println(list);
    }

    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int remainder = integer % 2;
            if (remainder == 0) return true;
            else return false;
        }
    };
    static Predicate<Integer> p2 = (x)->x%2==0;
}




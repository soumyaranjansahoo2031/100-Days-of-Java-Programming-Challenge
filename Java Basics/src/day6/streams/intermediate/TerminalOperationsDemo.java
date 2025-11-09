package day6.streams.intermediate;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationsDemo {
    static void main(String[] args) {
        //reduce()
        List<Integer> numbers = List.of(1,2,3,4,5);
        Stream<Integer> integerStream = numbers.stream();
        int sum = integerStream.reduce(0,(acc,num)->acc+num);
        System.out.println(sum);

        //collect()
        //find & match
        //iteration


    }
}

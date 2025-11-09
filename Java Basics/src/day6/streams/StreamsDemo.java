package day6.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    static void main(String[] args) {
        List<String> items = Arrays.asList("Alice","Bob","Charlie");

        for(String hero : items){
            System.out.print(hero+" ");
        }
        System.out.println();

        //Using Streams
        Stream<String> stream = items.stream();
        stream.forEach((hero)-> System.out.print(hero+" "));
        System.out.println();

        items.stream().forEach( System.out::println);

        items.stream().
                filter((hero)->hero.startsWith("C"))
                .forEach(System.out::println);
    }

}
/*
//USECASES
1. Filtering
2.Mapping
3.Aggreagation
4.Searching
5.Itreration
6.


 */
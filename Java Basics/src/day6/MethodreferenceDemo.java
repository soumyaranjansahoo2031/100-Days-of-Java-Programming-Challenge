package day6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodreferenceDemo {
    static void main(String[] args) {


        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        // using for loop
        for(int i = 0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("---------------------1");
        // using enhanced for loop
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("----------------------2");
        //
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-----------------------3");
        //
        names.forEach(s -> System.out.println(s));
        System.out.println("-----------------------4");
        //
        names.forEach(System.out::println);
        System.out.println("-----------------------5");
    }
}

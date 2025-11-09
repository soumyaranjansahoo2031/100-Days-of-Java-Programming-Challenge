package day6.functioanlInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    //    public static BiFunction<Integer,Integer,Integer> addFunction = (a,b)->a+b;
    public static BiFunction<Integer,Integer,Integer> substractFunction = (a,b)->a-b;

    public static BiFunction<Integer,Integer,Integer> addFunction = Integer::sum;

    static void main(String[] args) {
        System.out.println(addFunction.apply(7,9));
        System.out.println(substractFunction.apply(9,7));

        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        BiFunction<Integer, Integer, Integer> combinedFunction =
                addFunction.andThen(multiplyBy2);

        System.out.println(combinedFunction.apply(2,5));
    }
}

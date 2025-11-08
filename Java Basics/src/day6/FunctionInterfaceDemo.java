package day6;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static Function<Integer,Integer> addFunction = (a)->a+5;
    public static Function<Integer,Integer> substractFunction = (a)->a-5;
    public static Function<Integer,Integer> combinedFunction = addFunction.andThen(substractFunction);


    static void main(String[] args) {
        System.out.println(addFunction.apply(7));
        System.out.println(substractFunction.apply(9));
        System.out.println(combinedFunction.apply(7));
    }
}

// it is like in-built functional interface

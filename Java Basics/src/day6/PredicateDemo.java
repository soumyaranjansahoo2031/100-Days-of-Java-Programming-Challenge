package day6;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));

        BiPredicate<Integer,Integer> isSumEven=(a,b)-> (a+b)%2==0;
        System.out.println(isSumEven.test(10,7));
        System.out.println(isSumEven.test(7,9));
    }
}

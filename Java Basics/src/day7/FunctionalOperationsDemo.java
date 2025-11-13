package day7;

import java.util.Optional;

public class FunctionalOperationsDemo {
    static void main(String[] args) {
//        Optional<String> name = Optional.of(null);
        Optional<String> nullName = Optional.ofNullable("master");
        System.out.println(nullName);

        //ifPresent
         nullName.ifPresent(name -> {
            System.out.println(name);
        });

         //map()
         Optional<String> upperCase = nullName.map(String::toUpperCase);
        System.out.println(upperCase.orElse("default"));
    }
}

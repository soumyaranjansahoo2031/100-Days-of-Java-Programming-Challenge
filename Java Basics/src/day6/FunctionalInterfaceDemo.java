package day6;

@FunctionalInterface
interface BookAction {
    void perform();
}

@FunctionalInterface
interface Operation{
    int add(int a, int b);
}

@FunctionalInterface
interface Operation2{
    int add(int a);
}
public class FunctionalInterfaceDemo {
    static void main(String[] args) {
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("action1 performed");
            }
        };
        action1.perform();

        //lambda expression
        BookAction action2 = ()->{
            System.out.println("action2 performed");
        };
        action2.perform();

        // lambda expression - 1 line
        BookAction action3 = () -> System.out.println("action3 performed");
        action3.perform();

        //Functional Intrerface with parameters
        Operation operation1 = (int a,int b)->{
            return (a+b);
        };
//        Operation operation1 = (int a,int b)-> return (a+b);
        System.out.println(operation1.add(3,5));

        Operation2 operation2 = (int a) -> { return a+5;};
        System.out.println(operation2.add(7));
    }
}

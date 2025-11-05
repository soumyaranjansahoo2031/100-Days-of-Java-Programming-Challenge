package day3.p3_abstraction;

public class AbstractionDemo {
    static void main() {
//        BankAccount bankAccount = new BankAccount() {
//            @Override
//            public void deposit(double amount) {
//
//            }
//
//            @Override
//            public void withdraw(double amount) {
//
//            }
//    }
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(100);

        BankAccount bankAccount1 = new SavingsAccount();
        bankAccount1.deposit(50);

        bankAccount1 = new CurrentAccount();
        bankAccount1.withdraw(100);

    }
}

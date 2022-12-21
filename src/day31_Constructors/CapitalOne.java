package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount bankAccount1= new BankAccount();
        bankAccount1.setInfo("Ahmed Ozkok",123456789);
        System.out.println(bankAccount1);
        bankAccount1.deposit(1000);
        System.out.println(bankAccount1);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(900);
        bankAccount1.checkBalance();

        bankAccount1.deposit(900);
        bankAccount1.checkBalance();

        BankAccount bankAccount2= new BankAccount();
        bankAccount2.setInfo("Aygun",987456123);
        bankAccount2.checkBalance();
        bankAccount2.deposit(15000);
        bankAccount2.deposit(2500);
        bankAccount2.checkBalance();
    }
}

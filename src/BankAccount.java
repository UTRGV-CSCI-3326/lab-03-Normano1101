//create java class
public class BankAccount{
    public static void main(String[] args){
        double accBalance = 2175.37;

        accBalance -= 302.50;
        accBalance += 50.03;
        accBalance -= accBalance/2;
        accBalance +=20.00;
        accBalance -= 1;
        accBalance *= 2;
        accBalance += 1;

        System.out.print("Bobs Bank Account Balance is $");
        System.out.printf("%.2f", accBalance);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BankFactory bankFactory =  new BankFactory();
        System.out.print("Please write your card number :   ");
        String bankCode = scan.nextLine();
        IBank bank=bankFactory.getBank(bankCode);
        System.out.println(bank.withDraw());

    }
}
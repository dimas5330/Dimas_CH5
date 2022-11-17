public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount dimas = new BankAccount("85454000", "085803650740", "goenardid@gmail.com", "Dimas");

        dimas.deposit(500);
        dimas.deposit(1500);

        System.out.println("Balance is: " + dimas.getBalance()); // 2000

        dimas.withdraw(400);

        System.out.println("Balance is: " + dimas.getBalance()); // 1600
    }
}
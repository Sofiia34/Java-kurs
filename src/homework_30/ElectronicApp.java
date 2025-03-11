package homework_30;

public class ElectronicApp {
    public  static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Андрій", 500);

        ElectronicWallet eWallet = new ElectronicWallet("Марія", 300);

        bankAccount.checkBalance();
        eWallet.checkBalance();

        bankAccount.depositTransfer(100);
        eWallet.depositTransfer(50);

        bankAccount.withdrawMoney(50);
        eWallet.withdrawMoney(20);

        System.out.println("\n🔁 Перекази між рахунками:");
        bankAccount.transferMoney(eWallet, 50); // Банк -> Гаманець
        eWallet.transferMoney(bankAccount, 30); // Гаманець -> Банк

        System.out.println("\n📊 Підсумкові баланси:");
        bankAccount.checkBalance();
        eWallet.checkBalance();
    }
}


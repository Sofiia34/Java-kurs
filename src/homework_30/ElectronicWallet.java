package homework_30;

    class ElectronicWallet implements PaymentSystem {
        private double balance;
        private String owner;

        public ElectronicWallet(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        @Override
        public void withdrawMoney(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(owner + " 📲 зняв(ла) " + amount + "$. Новий баланс: " + balance + "$.");
            } else {
                System.out.println("❌ Недостатньо коштів або некоректна сума.");
            }
        }

        @Override
        public void depositTransfer(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(owner + " 💵 поповнив(ла) електронний гаманець на " + amount + "$. Новий баланс: " + balance + "$.");
            } else {
                System.out.println("❌ Некоректна сума для поповнення.");
            }
        }

        @Override
        public double checkBalance() {
            System.out.println(owner + " 📊 Баланс: " + balance + "$.");
            return balance;
        }

        @Override
        public void transferMoney(PaymentSystem recipient, double amount) {
            if (amount > 0 && amount <= balance) {
                this.withdrawMoney(amount);
                recipient.depositTransfer(amount);
                System.out.println("🔄 Переказано " + amount + "$.");
            } else {
                System.out.println("❌ Недостатньо коштів для переказу.");
            }
        }
    }



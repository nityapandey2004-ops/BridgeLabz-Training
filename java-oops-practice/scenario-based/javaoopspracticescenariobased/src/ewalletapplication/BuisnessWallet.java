package ewalletapplication;

import ewalletapplication.Wallet;

public class BuisnessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% tax

    public BuisnessWallet(double balance) {
        super(balance);
    }

    public BuisnessWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (deductBalance(totalDeduction)) {
            receiver.getWallet().addBalance(amount);
            transactions.add(new Transaction("Business transfer (Tax: ₹" + tax + ")", -totalDeduction));
            receiver.getWallet().transactions.add(
                    new Transaction("Received business transfer", amount));
        } else {
            System.out.println("Insufficient balance (Business Wallet)");
        }
    }
}

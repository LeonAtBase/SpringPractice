package model;

public class PayByCreditCard {

    private String account;
    private double amount;

    public String getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void getMessage() {
        System.out.println(account + " paid " + amount + " dollars by credit card.");
    }
}

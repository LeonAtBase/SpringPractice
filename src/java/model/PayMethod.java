package model;

public class PayMethod {

    private PayByCash payByCash;
    private PayByCreditCard payByCreditCard;

    public void setPayByCash(PayByCash payByCash) {
        this.payByCash = payByCash;
    }

    public void setPayByCreditCard(PayByCreditCard payByCreditCard) {
        this.payByCreditCard = payByCreditCard;
    }

    public void getMessage() {
        payByCash.getMessage();
        payByCreditCard.getMessage();
    }
}

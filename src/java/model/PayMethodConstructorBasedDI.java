package model;

public class PayMethodConstructorBasedDI {

    PayByCash payByCash;
    PayByCreditCard payByCreditCard;

    public PayMethodConstructorBasedDI(PayByCash payByCash, PayByCreditCard payByCreditCard) {
        this.payByCash = payByCash;
        this.payByCreditCard = payByCreditCard;
    }

    public void getMessage() {
        payByCash.getMessage();
        payByCreditCard.getMessage();
    }
}

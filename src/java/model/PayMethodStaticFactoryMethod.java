package model;

public class PayMethodStaticFactoryMethod {

    PayByCash payByCash;
    PayByCreditCard payByCreditCard;

    public PayMethodStaticFactoryMethod(PayByCash payByCash, PayByCreditCard payByCreditCard) {
        this.payByCash = payByCash;
        this.payByCreditCard = payByCreditCard;
    }

    public static PayMethodStaticFactoryMethod createInstance(
            PayByCash payByCash, PayByCreditCard payByCreditCard) {
        PayMethodStaticFactoryMethod payMethodStaticFactoryMethod
                = new PayMethodStaticFactoryMethod(payByCash, payByCreditCard);
        return payMethodStaticFactoryMethod;
    }

    public void getMessage() {
        payByCash.getMessage();
        payByCreditCard.getMessage();
    }
}

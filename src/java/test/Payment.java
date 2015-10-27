package test;

import model.PayMethodConstructorBasedDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Payment {

    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("Beans.xml");

        // c-namespace
        PayMethodConstructorBasedDI payMethodConstructorBasedDI
                = (PayMethodConstructorBasedDI) applicationContext.getBean(
                        "payMethodConstructorBasedDIC");
        payMethodConstructorBasedDI.getMessage();
//
//        // static factory method
//        PayMethodStaticFactoryMethod payMethodStaticFactoryMethod = applicationContext.getBean(
//                "payMethodStaticFactoryMethod", PayMethodStaticFactoryMethod.class);
//        payMethodStaticFactoryMethod.getMessage();
//
//        // constructor-based DI
//        PayMethodConstructorBasedDI payMethodConstructorBasedDI
//                = (PayMethodConstructorBasedDI) applicationContext.getBean("payMethodConstructorBasedDI");
//        payMethodConstructorBasedDI.getMessage();
//        
//        // setter-based DI
//        PayMethod payMethod = applicationContext.getBean("payMethod", PayMethod.class);
//        payMethod.getMessage();
//        
//        // injection bean by bean
//        PayByCash payByCash = applicationContext.getBean("payByCash", PayByCash.class);
//        payByCash.getMessage();
//        PayByCreditCard payByCreditCard = (PayByCreditCard) applicationContext.getBean("payByCreditCard");
//        payByCreditCard.getMessage();
    }
}

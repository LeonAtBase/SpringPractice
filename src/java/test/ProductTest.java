package test;

import dao.ProductJDBCTemplate;
import java.util.List;
import model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ProductJDBCTemplate productJDBCTemplate
                = (ProductJDBCTemplate) context.getBean("productJDBCTemplateInnerBean");
//
//        System.out.println("");
//        System.out.println("------Records Creation--------");
//        productJDBCTemplate.create("可口可樂", 75);
//        productJDBCTemplate.create("純喫茶綠茶", 25);
//
        System.out.println("");
        System.out.println("------Listing Multiple Records--------");
        List<Product> products = productJDBCTemplate.listProducts();
        for (Product record : products) {
            System.out.print("ID: " + record.getId());
            System.out.print(", Name: " + record.getName());
            System.out.println(", Price: " + record.getPrice());
        }
//
//        System.out.println("");
//        System.out.println("----Listing Record with ID = 2 -----");
//        Product product = productJDBCTemplate.getProduct(2);
//        System.out.print("ID: " + product.getId());
//        System.out.print(", Name: " + product.getName());
//        System.out.println(", Price: " + product.getPrice());
//
//        System.out.println("");
//        System.out.println("----Updating Record with ID = 27 -----");
//        productJDBCTemplate.update(27, 22);
//        
//        System.out.println("");
//        System.out.println("----Deletion Record with ID = 27 -----");
//        productJDBCTemplate.delete(27);
    }
}

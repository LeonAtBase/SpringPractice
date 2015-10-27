package dao;

import java.util.List;
import javax.sql.DataSource;
import model.Product;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductJDBCTemplate {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, double price) {
        String SQL = "INSERT INTO product (name, price) VALUES (?, ?)";
        jdbcTemplateObject.update(SQL, name, price);
        System.out.println("Created Record Name= " + name + " Price= " + price);
    }

    public List<Product> listProducts() {
        String SQL = "SELECT * FROM product";
        List<Product> products = jdbcTemplateObject.query(SQL, new ProductMapper());
        return products;
    }

    public Product getProduct(Integer id) {
        String SQL = "SELECT * FROM product WHERE ID = ?";
        Product product = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new ProductMapper());
        return product;
    }

    public void update(Integer id, double price) {
        String SQL = "UPDATE product SET price = ? WHERE id = ?";
        jdbcTemplateObject.update(SQL, price, id);
        System.out.println("Updated Record with ID = " + id);
    }

    public void delete(Integer id) {
        String SQL = "DELETE FROM product WHERE id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);
    }
}

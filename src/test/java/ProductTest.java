import junit.framework.TestCase;
import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.*;

public class ProductTest {
    private ProductRepository repository = new ProductRepository();
    private Product shirt = new Product(1, "King", 2021);
    private Product skirt = new Product(2, "qwe", 2020);
    private Product skirt1 = new Product(3, "qwe", 2020);
//    private final Product blouse = new Product();
//    private final Product trousers = new Product();

    @Test

    public void shouldAddItem() {

        repository.save(shirt);

        Product[] expected = new Product[]{shirt};

        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveItem() {
        repository.save(shirt);
        repository.save(skirt);
        repository.save(skirt1);
        repository.removeById(1);
        repository.removeById(2);
        repository.save(shirt);
        Product[] expected = new Product[]{skirt1,shirt};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindById(){
        repository.save(shirt);
        repository.save(skirt);

        Product expected = shirt;

        Product actual = repository.findById(1);

        assertEquals(expected,actual);
    }
}
package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {

    private ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    Book MuhaCokotuha = new Book(1, "MuhaCokotuha", 50, "Chuykovskiy");
    Book Moydodyr = new Book(2, "Moydodyr", 60, "Chuykovskiy");
    Book Phone = new Book(3, "Phone", 70, "ChuykovskiyK");
    Smartphone Sony = new Smartphone(4, "Phone", 5000, "Sony");
    Smartphone Apple = new Smartphone(5, "11pro", 50000, "Apple");
    Smartphone Huawey = new Smartphone(6, "Q10", 15000, "Huawey");

    @BeforeEach
    public void setUp() {
        manager.add(MuhaCokotuha);
        manager.add(Moydodyr);
        manager.add(Phone);
        manager.add(Sony);
        manager.add(Apple);
        manager.add(Huawey);
    }

    @Test
    public void ShouldsearchByName() {

        String search = "11pro";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{Apple};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldsearchByAuthor() {

        String search = "ChuykovskiyK";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{Phone};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldsearchByManufacturer() {

        String search = "Sony";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{Sony};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldsearchBySameAuthor() {

        String search = "Chuykovskiy";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{MuhaCokotuha, Moydodyr};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldsearchBySameName() {

        String search = "Phone";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{Phone, Sony};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldsearchByNoMatches() {

        String search = "Test";

        Product[] actual = manager.searchBy(search);
        Product[] expected = new Product[]{};

        assertArrayEquals(expected, actual);
    }
}

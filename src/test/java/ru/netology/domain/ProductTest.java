package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(1, "Sumsung", 20000);

    @Test
    public void shouldSearchProduct() {
        String search = "Sumsung";
        assertTrue(product.matches(search));
    }

    @Test
    public void shouldNotSearchProduct() {
        String search = "Vertu";
        assertFalse(product.matches(search));
    }
}

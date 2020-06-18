package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(6, "Q10", 15000, "Huawey");

    @Test
    public void shouldSearchSmartphoneByName() {
        String search = "Q10";
        smartphone.matches(search);
        assertTrue(smartphone.matches(search));
    }

    @Test
    public void shouldNotSearchSmartphoneByName() {
        String search = "Galaxy";
        smartphone.matches(search);
        assertFalse(smartphone.matches(search));
    }

    @Test
    public void shouldSearchSmartphoneByAuthor() {
        String search = "Huawey";
        assertTrue(smartphone.matches(search));
    }

    @Test
    public void shouldNotSearchSmartphoneByAuthor() {
        String search = "Sumsung";
        assertFalse(smartphone.matches(search));
    }
}

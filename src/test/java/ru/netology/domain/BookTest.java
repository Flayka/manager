package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(2, "Moydodyr", 60, "Chuykovskiy");

    @Test
    public void shouldSearchBookByName() {
        String search = "Moydodyr";
        assertTrue(book.matches(search));
    }

    @Test
    public void shouldNotSearchBookByName() {
        String search = "Tarakanische";
        assertFalse(book.matches(search));
    }

    @Test
    public void shouldSearchBookByAuthor() {
        String search = "Chuykovskiy";
        assertTrue(book.matches(search));
    }

    @Test
    public void shouldNotSearchBookByAuthor() {
        String search = "Pushkin";
        assertFalse(book.matches(search));
    }
}

package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book = new Book(2, "Moydodyr", 60, "Chuykovskiy");

    @Test
    public void shouldSearchBookByName() {
        String search = "Moydodyr";
        book.matches(search);
        assertTrue(book.matches(search));
    }

    @Test
    public void shouldNotSearchBookByName() {
        String search = "Tarakanische";
        book.matches(search);
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
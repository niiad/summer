package com.niiad.summer.dao;

import com.niiad.summer.domain.Author;
import com.niiad.summer.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {}

    static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
}

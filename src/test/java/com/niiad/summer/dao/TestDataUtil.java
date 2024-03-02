package com.niiad.summer.dao;

import com.niiad.summer.domain.Author;

public final class TestDataUtil {
    private TestDataUtil() {}

    static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }
}

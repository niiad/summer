package com.niiad.summer.dao;

import com.niiad.summer.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);
}

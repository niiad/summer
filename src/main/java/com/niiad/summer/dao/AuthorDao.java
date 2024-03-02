package com.niiad.summer.dao;

import com.niiad.summer.domain.Author;

import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);
}

DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS authors;

CREATE TABLE authors (
    id BIGSERIAL PRIMARY KEY,
    name TEXT,
    age INTEGER
);

CREATE TABLE books (
    isbn TEXT PRIMARY KEY,
    title TEXT,
    author_id BIGINT,
    CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES authors(id)
);

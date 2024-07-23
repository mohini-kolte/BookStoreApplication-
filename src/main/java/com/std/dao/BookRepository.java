package com.std.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.std.model.Book;


public interface BookRepository extends JpaRepository<Book, Long>{

}
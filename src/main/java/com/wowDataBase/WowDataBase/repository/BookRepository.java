package com.wowDataBase.WowDataBase.repository;

import com.wowDataBase.WowDataBase.modules.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query methods can be defined here
}
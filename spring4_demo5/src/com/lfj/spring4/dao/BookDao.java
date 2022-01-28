package com.lfj.spring4.dao;

import com.lfj.spring4.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lfj
 * @create 2022-01-20-9:38
 */

@Repository
public interface BookDao {
    void add(Book book);
    void delete(String id);
    void update(Book book);
    int select();
    Book findBookInfo(String id);
    List<Book> findAllBook();
    void batchAddBook(List<Object[]> batchArgs);
    void batchdeleteBook(List<Object[]> batchArgs);
    void batchupdateBook(List<Object[]> batchArgs);
}

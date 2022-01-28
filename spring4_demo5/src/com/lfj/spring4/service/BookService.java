package com.lfj.spring4.service;

import com.lfj.spring4.dao.BookDao;
import com.lfj.spring4.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lfj
 * @create 2022-01-20-9:38
 */
@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //删除的方法
    public void deleteBook(String id){
        bookDao.delete(id);
    }

    //修改的方法
    public void updateBook(Book book){
        bookDao.update(book);
    }

    //查询的方法
    public int selectBook(){
        return bookDao.select();
    }

    //查询返回对象
    public Book findone(String id){
        return bookDao.findBookInfo(id);
    }

    //查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    //批量添加
    public void batchadd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    //批量删除
    public void batchdelete(List<Object[]> batchArgs){
        bookDao.batchdeleteBook(batchArgs);
    }

    //批量修改
    public void batchupdate(List<Object[]> batchArgs){
        bookDao.batchupdateBook(batchArgs);
    }


}

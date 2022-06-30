package com.book.service;

import com.book.entity.Book;
import com.book.entity.Borrow;
import com.book.entity.Student;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Borrow> getBorrowList();
    void returnBook(String id);
    List<Book> getActiveBookList();
    List<Student> getStudentList();
    void addBorrow(int sid, int bid);
    Map<Book,Boolean> getBookList();  // 不用过滤书籍已经被借走的
    void deleteBook(int bid);
    void addBook(String title,String des, double price);
}

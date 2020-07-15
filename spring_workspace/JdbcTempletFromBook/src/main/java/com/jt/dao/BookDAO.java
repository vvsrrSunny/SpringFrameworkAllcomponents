package com.jt.dao;

import com.jt.beans.Book;

public interface BookDAO {
public int addBook(Book book);
public int updateBook(Long ISBN,int price);
public int deleteBook(Long ISBN);
}

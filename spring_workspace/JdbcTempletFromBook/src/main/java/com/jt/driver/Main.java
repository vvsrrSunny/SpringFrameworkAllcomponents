package com.jt.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jt.beans.Book;
import com.jt.config.*;
import com.jt.dao.BookDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ApplicationContext context=new
		// ClassPathXmlApplicationContext("connection.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BookDAO bookDAO = (BookDAO) context.getBean("bookDAOImpl_JDBCTemplate");
		int insertRows = bookDAO.addBook(new Book("Learning Modular Java Programming 4", 4, "PacktPub publication", 800,
				"explore the power of Modular programming", "T.M.Jog"));
		int rows = bookDAO.updateBook(2L, 800);

		if (insertRows > 0) {
			System.out.println("book inserted successfully");
		} else
			System.out.println("SORRY!cannot add book");

		if (rows > 0) {
			System.out.println("book updated successfully");
		} else
			System.out.println("SORRY!cannot add book");
//		if (bookDAO.deleteBook(4L) > 0) {
//			System.out.println("book deleteded successfully");
//		} else
//			System.out.println("SORRY!cannot add book");

	}

}

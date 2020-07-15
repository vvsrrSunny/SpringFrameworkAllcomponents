package com.ds.dao;

import com.ds.beans.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDAOImpl implements BookDAO {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rows = 0;
		String INSERT_BOOK = "insert into book values(?,?,?,?,?,?)";
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BOOK);
			preparedStatement.setString(1, book.getBookName());
			preparedStatement.setLong(2, book.getISBN());
			preparedStatement.setString(3, book.getPublication());
			preparedStatement.setInt(4, book.getPrice());
			preparedStatement.setString(5, book.getDescription());
			preparedStatement.setString(6, book.getAuthor());
			rows = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;

	}

}

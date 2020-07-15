package com.jt.dao;

import java.util.HashMap;

import javax.sql.DataSource;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jt.beans.Book;

@Repository("bookDAOImpl_JDBCTemplate")
public class BookDAOImpl_JDBCTemplate implements BookDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	


	//private String INSERT_QUERY = "insert into book values(?,?,?,?,?,?)";
	private String UPDATE_QUERY="update book set price=? where ISBN=?";
	private String DELETE_QUERY="delete from book where ISBN=?";
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rows = 0;
		String INSERT_QUERY = "insert into book values(:bookname,:ISBN,:publication,:price,:description,:author)";
		HashMap<String,Object> sqlParams =new HashMap<String, Object>();
		sqlParams.put("bookname", book.getBookName());
		sqlParams.put("ISBN", book.getISBN());
		sqlParams.put("publication", book.getPublication());
		sqlParams.put("price", book.getPrice());
		sqlParams.put("description", book.getDescription());
		sqlParams.put("author", book.getAuthor());
//		rows = jdbcTemplate.update(INSERT_QUERY, book.getBookName(), book.getISBN(), book.getPublication(), book.getPrice(),
//				book.getDescription(), book.getAuthor());
		rows= namedParameterJdbcTemplate.update(INSERT_QUERY, sqlParams);

		return rows;
	}

	@Override
	public int updateBook(Long ISBN, int price) {
		// TODO Auto-generated method stub
		int rows;
		rows= jdbcTemplate.update(UPDATE_QUERY,price,ISBN);
		return rows;
	}

	@Override
	public int deleteBook(Long ISBN) {
		// TODO Auto-generated method stub
		int rows;
		rows=jdbcTemplate.update(DELETE_QUERY, ISBN);
		return rows;
	}

}

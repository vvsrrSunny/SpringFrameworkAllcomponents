import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.beans.Book;
import com.ds.config.ConnectionConfig;
import com.ds.dao.BookDAO;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context=new ClassPathXmlApplicationContext("connection.xml");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ConnectionConfig.class);
		BookDAO bookDAO=(BookDAO) context.getBean("bookDao");
		int rows=bookDAO.addBook(new Book("Learning Modular Java Programming 3", 9781234L,"PacktPub publication",800,"explore the power of Modular programming","T.M.Jog"));
	    if(rows>0)
	    {
	    	System.out.println("book inserted successfully");
	    }
	    else
	    	System.out.println("SORRY!cannot add book");

	}

}

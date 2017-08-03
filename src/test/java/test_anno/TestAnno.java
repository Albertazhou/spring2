package test_anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import can.anno.User;
import can.anno.UserService;
import can.aop.Book;
import can.xmlanno.BookService;

public class TestAnno {
//	@Test
//	public void testUser(){
//		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//		User user=(User)context.getBean("user");
//		System.out.println(user);
//		user.add();
//		
//		UserService us=(UserService) context.getBean("userService");
//		us.add();
//	}
//	
//	@Test
//	public void testxmlanno(){
//		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
//		BookService bs=(BookService) context.getBean("bookService");
//		bs.add();
//	}
	
	@Test
	public void testaop(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
		Book book=(Book) context.getBean("book");
		book.add();
	}
	

}

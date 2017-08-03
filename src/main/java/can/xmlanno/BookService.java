package can.xmlanno;

import javax.annotation.Resource;

public class BookService {
	
	//�õ�bookdao��orderdao����
	
	@Resource(name="bookDao")
	private BookDao bookDao;
	
	@Resource(name="ordersDao")
	private OrdersDao ordersDao;
	public void add(){
		System.out.println("Book...");
		bookDao.book();
		ordersDao.buy();
	}

}

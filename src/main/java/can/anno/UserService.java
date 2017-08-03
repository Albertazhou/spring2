package can.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	//得到dao对象
	//定义dao类型属性
	
//	@Autowired //自动注入(根据类名找到对应的对象);
//	private UserDao userDao;
	//使用注解不需set方法
	
	//指定的对象
	@Resource(name="userdao")
	private UserDao userDao;
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("service add....");
		userDao.add();

	}

}

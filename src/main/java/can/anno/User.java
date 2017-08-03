package can.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository(value="user")//注解方式创建对象
@Scope(value="prototype")//多实例模式
public class User {
	public  void add() {
		// TODO Auto-generated method stub
		System.out.println("add.....");

	}

}

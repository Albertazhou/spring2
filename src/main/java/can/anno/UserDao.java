package can.anno;

import org.springframework.stereotype.Component;

@Component(value="userdao")
public class UserDao {
	public void add(){
		System.out.println("userdao add");
	}

}

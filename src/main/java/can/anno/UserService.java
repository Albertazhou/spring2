package can.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	//�õ�dao����
	//����dao��������
	
//	@Autowired //�Զ�ע��(���������ҵ���Ӧ�Ķ���);
//	private UserDao userDao;
	//ʹ��ע�ⲻ��set����
	
	//ָ���Ķ���
	@Resource(name="userdao")
	private UserDao userDao;
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("service add....");
		userDao.add();

	}

}

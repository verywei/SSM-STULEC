package per.wei.service.imp;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import per.wei.dao.StudentDao;
import per.wei.entity.Student;
import per.wei.service.UserService;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月23日 下午10:43:27   
*/
@Service("userService")
public class UserServiceImp implements UserService {
	@Resource
	private StudentDao studentDao;
	
	@Override
	public Student login(String userName) {
		// TODO Auto-generated method stub
		return studentDao.selectByStucard(userName);
	}

}

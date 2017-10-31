package per.wei.service.imp;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import per.wei.dao.LectureDao;
import per.wei.dao.StudentDao;
import per.wei.entity.Lecture;
import per.wei.entity.Student;
import per.wei.service.UserService;
import per.wei.test.Test;
import sun.print.resources.serviceui;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��23�� ����10:43:27   
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

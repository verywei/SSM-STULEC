package per.wei.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.wei.dao.AdminDao;
import per.wei.entity.Admin;
import per.wei.service.AdminService;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��11��6�� ����11:13:51   
*/
@Service
public class AdminServiceimp implements AdminService {
	@Autowired
	AdminDao adminDao;
	
	@Override
	public boolean login(String names, String passwords) {
		Admin admin=null;
		admin=adminDao.login(names);
		if (admin==null||!admin.getPassword().equals(passwords)) {
			return false;
		}
		else if (admin.getPassword().equals(passwords)) {
			return true;
		}
		else {
			return false;
		}
	}

}

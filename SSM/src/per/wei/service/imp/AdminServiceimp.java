package per.wei.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.wei.dao.AdminDao;
import per.wei.entity.Admin;
import per.wei.service.AdminService;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年11月6日 下午11:13:51   
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

package per.wei.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.wei.dao.SelectlectureDao;
import per.wei.entity.InsertSelectlecture;
import per.wei.entity.Lecture;
import per.wei.entity.LectureToUser;
import per.wei.entity.Selectlecture;
import per.wei.service.LectureService;
import per.wei.service.SelectlectureService;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月27日 下午10:16:14   
*/
@Service
public class SelectlectureServiceImp implements SelectlectureService{
	@Resource
	SelectlectureDao selectlectureDao;
	@Override
	public List<LectureToUser> selectByUser(String id) {
		return selectlectureDao.selectByUser(id);
	}
	@Override
	public void insertIntoStuToLec(InsertSelectlecture insertSelectlecture) {
		// TODO Auto-generated method stub
		selectlectureDao.insert(insertSelectlecture);
	}
	@Override
	public void deleteSelect(InsertSelectlecture insertSelectlecture) {
		System.out.println(insertSelectlecture.getLecture()+insertSelectlecture.getStudent());
		selectlectureDao.delete(insertSelectlecture);
	}
	
}

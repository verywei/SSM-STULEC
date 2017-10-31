package per.wei.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.wei.dao.LectureDao;
import per.wei.entity.Lecture;
import per.wei.service.LectureService;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����10:15:33   
*/
@Service("lectureService")
public class LectureServiceImp implements LectureService {
	@Autowired
	LectureDao lectureDao;
	@Override
	public List<Lecture> getAllLecture(String id) {
		
		return lectureDao.getAllLecture(id);
	}
	@Override
	public void insert(Lecture lecture) {
		lectureDao.insert(lecture);
	}
	@Override
	public List<Lecture> getSelectingLecture(String id) {
		return lectureDao.selectSelectingByUser(id);
	}

}

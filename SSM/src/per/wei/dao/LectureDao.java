package per.wei.dao;

import java.util.List;

import per.wei.entity.Lecture;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����8:52:55   
*/
public interface LectureDao {
	public List<Lecture> getAllLecture(String id) ;
	public List<Lecture> selectSelectingByUser(String id);
	public void insert(Lecture lecture);
}

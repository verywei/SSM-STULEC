package per.wei.service;/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����10:14:20   
*/

import java.util.List;

import per.wei.entity.Lecture;

public interface LectureService {
	public List<Lecture> getAllLecture(String id);
	public List<Lecture> getSelectingLecture(String id);
	public void insert(Lecture lecture);
}

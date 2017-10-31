package per.wei.service;/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午10:14:20   
*/

import java.util.List;

import per.wei.entity.Lecture;

public interface LectureService {
	public List<Lecture> getAllLecture(String id);
	public List<Lecture> getSelectingLecture(String id);
	public void insert(Lecture lecture);
}

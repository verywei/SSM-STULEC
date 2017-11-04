package per.wei.dao;

import java.util.List;

import per.wei.entity.Lecture;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午8:52:55   
*/
public interface LectureDao {
	public List<Lecture> getAllLecture(String id) ;
	public List<Lecture> selectSelectingByUser(String id);
	public void insert(Lecture lecture);
}

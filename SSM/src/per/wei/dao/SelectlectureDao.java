package per.wei.dao;/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����9:43:02   
*/

import java.util.List;

import per.wei.entity.InsertSelectlecture;
import per.wei.entity.LectureToUser;
import per.wei.entity.Selectlecture;

public interface SelectlectureDao {
	public List<LectureToUser> selectByUser(String id);
	public void insert(InsertSelectlecture insertSelectlecture);
	public void delete(InsertSelectlecture insertSelectlecture);
}

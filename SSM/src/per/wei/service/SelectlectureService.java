package per.wei.service;/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��27�� ����10:14:36   
*/

import java.util.List;

import per.wei.entity.InsertSelectlecture;
import per.wei.entity.LectureToUser;

public interface SelectlectureService {
	public List<LectureToUser> selectByUser(String id);
	public void insertIntoStuToLec(InsertSelectlecture insertSelectlecture);
	public void deleteSelect(InsertSelectlecture insertSelectlecture);
}

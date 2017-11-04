package per.wei.service;/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月27日 下午10:14:36   
*/

import java.util.List;

import per.wei.entity.InsertSelectlecture;
import per.wei.entity.LectureToUser;

public interface SelectlectureService {
	public List<LectureToUser> selectByUser(String id);
	public void insertIntoStuToLec(InsertSelectlecture insertSelectlecture);
	public void deleteSelect(InsertSelectlecture insertSelectlecture);
}

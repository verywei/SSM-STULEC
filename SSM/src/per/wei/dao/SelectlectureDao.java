package per.wei.dao;/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午9:43:02   
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

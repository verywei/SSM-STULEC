package per.wei.dao;/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��30�� ����10:29:15   
*/

import java.util.List;

import per.wei.entity.JoinLevels;
import per.wei.entity.Levels;
import per.wei.entity.SelectJoinLevels;

public interface LevelsDao {
	public List<Levels> getAllLevel(String id);
	public List<SelectJoinLevels> getJoinLevels(String id);
}

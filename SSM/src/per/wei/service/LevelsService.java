package per.wei.service;/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��30�� ����10:32:41   
*/

import java.util.List;

import per.wei.entity.JoinLevels;
import per.wei.entity.Levels;
import per.wei.entity.SelectJoinLevels;

public interface LevelsService {
	public List<Levels> getAllLevels(String id);
	public List<SelectJoinLevels> getJoinLevels(String id);
	public void insertIntoLevel(JoinLevels joinLevels);
	public void deleteIntoLevel(JoinLevels joinLevels);
}

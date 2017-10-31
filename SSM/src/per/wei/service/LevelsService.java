package per.wei.service;/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月30日 下午10:32:41   
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

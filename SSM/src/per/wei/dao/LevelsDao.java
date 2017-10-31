package per.wei.dao;/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月30日 下午10:29:15   
*/

import java.util.List;

import per.wei.entity.JoinLevels;
import per.wei.entity.Levels;
import per.wei.entity.SelectJoinLevels;

public interface LevelsDao {
	public List<Levels> getAllLevel(String id);
	public List<SelectJoinLevels> getJoinLevels(String id);
}

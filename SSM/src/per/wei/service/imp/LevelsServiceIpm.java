package per.wei.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import per.wei.dao.LectureDao;
import per.wei.dao.LevelsDao;
import per.wei.entity.Levels;
import per.wei.service.LevelsService;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��30�� ����10:33:55   
*/
@Service
public class LevelsServiceIpm implements LevelsService {
	@Autowired
	private LevelsDao levelsDao;
	
	@Override
	public List<Levels> getAllLevels(String id) {
		return levelsDao.getAllLevel(id);
	}

}

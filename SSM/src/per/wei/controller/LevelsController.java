package per.wei.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import per.wei.entity.JoinLevels;
import per.wei.entity.Levels;
import per.wei.entity.SelectJoinLevels;
import per.wei.service.LevelsService;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月30日 下午10:37:06   
*/
@Controller
@RequestMapping("/level")
public class LevelsController {
	@Autowired
	private LevelsService levelsService;
	
	
	/*
	 * 考级
	 */
	@RequestMapping("/levelpage")
	public ModelAndView getalllevel(HttpSession session,ModelAndView modelAndView){
		List<Levels> levels=levelsService.getAllLevels((String)session.getAttribute("user"));
		List<SelectJoinLevels> joinLevels=levelsService.getJoinLevels((String)session.getAttribute("user"));
		modelAndView.addObject("levels",levels);
		modelAndView.addObject("joinLevels",joinLevels);
		modelAndView.setViewName("/WEB-INF/content/level.jsp");
		return modelAndView;
	}
	/*
	 * 选择考级
	 */
	@RequestMapping("/insert")
	public ModelAndView insertJoinLevel(@RequestParam("level") String level,JoinLevels joinLevels,ModelAndView modelAndView,HttpSession session){
		joinLevels.setStu((String)session.getAttribute("user"));
		joinLevels.setLevel(level);
		levelsService.insertIntoLevel(joinLevels);
		modelAndView.setViewName("redirect:/level/levelpage");
		return modelAndView;
	}
	/*
	 * 退选
	 */
	@RequestMapping("/delete")
	public ModelAndView deleteJoinLevel(@RequestParam("level") String level,JoinLevels joinLevels,ModelAndView modelAndView,HttpSession session){
		joinLevels.setStu((String)session.getAttribute("user"));
		joinLevels.setLevel(level);
		levelsService.deleteIntoLevel(joinLevels);
		modelAndView.setViewName("redirect:/level/levelpage");
		return modelAndView;
	}
}

package per.wei.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.INTERNAL;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import per.wei.dao.LectureDao;
import per.wei.entity.InsertSelectlecture;
import per.wei.entity.Lecture;
import per.wei.entity.LectureToUser;
import per.wei.entity.Selectlecture;
import per.wei.service.LectureService;
import per.wei.service.SelectlectureService;
import per.wei.service.UserService;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午10:45:17   
*/
@Controller
@RequestMapping("/lecture")
public class LectureController {
	@Resource
	private LectureService lectureService;
	@Resource
	private SelectlectureService selectlectureService;
	@Resource
	private UserService userService;
	/*
	 * 添加课程
	 */
	@RequestMapping("/insert")
	public ModelAndView insert(@ModelAttribute("lecture")Lecture l,HttpSession session){
		ModelAndView modelAndView=new ModelAndView();
		lectureService.insert(l);
		List<Lecture> lectures=lectureService.getAllLecture((String)session.getAttribute("user"));
		modelAndView.addObject("lectures",lectures);
		modelAndView.addObject(modelAndView);
		modelAndView.setViewName("/WEB-INF/content/selectlecture.jsp");
		System.out.println(l);
		return modelAndView;
	}
	
	/*
	 * 跳转至主页
	 */
	@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest request){
		ModelAndView mView=new ModelAndView();
		String user=(String) request.getSession().getAttribute("user");
		List<LectureToUser> selectlectures=null;
		if (user!=null) {
			selectlectures=selectlectureService.selectByUser(user);
		}
		Lecture lecture=new Lecture();
		mView.addObject(lecture);
		mView.addObject("selectlectures",selectlectures);
		mView.setViewName("/WEB-INF/content/home.jsp");
		return mView;
	}
	/*
	 * 跳转至选课界面
	 */
	@RequestMapping("/selectpage")
	public ModelAndView selectleView(HttpSession session) {
		ModelAndView modelAndView=new ModelAndView();
		List<Lecture> lectures=lectureService.getAllLecture((String)session.getAttribute("user"));
		modelAndView.setViewName("/WEB-INF/content/selectlecture.jsp");
		Lecture lecture=new Lecture();
		modelAndView.addObject(lecture);
		List<Lecture> selectlectures=lectureService.getSelectingLecture((String)session.getAttribute("user"));
		modelAndView.addObject("selectlectures",selectlectures);
		modelAndView.addObject("lectures", lectures);
		return modelAndView;
	}
	
	@RequestMapping("/select")
	public ModelAndView select(@RequestParam("lecture") String lecture,InsertSelectlecture insertSelectlecture,HttpServletRequest request,HttpSession session){
		insertSelectlecture.setStudent((String)session.getAttribute("user"));
		insertSelectlecture.setLecture(lecture);
		insertSelectlecture.setScore("-1");
		selectlectureService.insertIntoStuToLec(insertSelectlecture);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("redirect:/lecture/selectpage");
		return modelAndView;
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("lecture") String lecture,InsertSelectlecture insertSelectlecture,ModelAndView modelAndView,HttpServletRequest request,HttpSession session){
		insertSelectlecture.setLecture(lecture);
		insertSelectlecture.setStudent((String)session.getAttribute("user"));
		selectlectureService.deleteSelect(insertSelectlecture);
		modelAndView.setViewName("redirect:/lecture/selectpage");
		return modelAndView;
	}
	
	
	
	
	
	
	
}

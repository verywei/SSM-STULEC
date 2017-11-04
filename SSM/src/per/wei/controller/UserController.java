package per.wei.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import per.wei.entity.Student;
import per.wei.service.LectureService;
import per.wei.service.SelectlectureService;
import per.wei.service.UserService;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月23日 下午10:44:51   
*/
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private LectureService lectureService;
	
	@Autowired
	private SelectlectureService selectlectureService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(String username,String password ,HttpServletRequest request){
		Student user=userService.login(username);
		ModelAndView mView=new ModelAndView();
		if (user==null) {
			request.setAttribute("error", "暂未注册");
		}else {
			if (password.equals(user.getPassword())) {
				request.getSession().setAttribute("user", user.getStucard());
				mView.setViewName("redirect:/lecture/home");
				return mView;
			}else {
				request.setAttribute("error","密码错误");
			}
		}
		mView.setViewName("/WEB-INF/content/index.jsp");
		return mView;
	}
	@RequestMapping(value="/")
	public ModelAndView index(){
		ModelAndView mView=new ModelAndView();
		mView.setViewName("/WEB-INF/content/index.jsp");
		return mView;
	}
	@RequestMapping("/exit")
	public ModelAndView exit(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		request.getSession().removeAttribute("error");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("redirect:/");
		return modelAndView;
	}
}

package per.wei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��11��6�� ����9:57:59   
*/
@Controller
@RequestMapping("/manage")
public class ManageController {
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView modelAndView){
		modelAndView.setViewName("/WEB-INF/content/level.jsp");
		System.out.println("manage.index");
		return modelAndView;	
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView modelAndView){
		
		
		
		return modelAndView;	
	}
	
}

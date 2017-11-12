package per.wei.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import per.wei.entity.Admin;
import per.wei.service.AdminService;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年11月6日 下午9:57:59   
*/
@Controller
@RequestMapping("/manage")
public class ManageController {
	@Autowired
	AdminService adminService;
	
	@RequestMapping("")
	public ModelAndView index(ModelAndView modelAndView,Admin admin){
		
		modelAndView.setViewName("/WEB-INF/content/manager/index.jsp");
		modelAndView.addObject(admin);
		System.out.println("manage.index");
		return modelAndView;	
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView modelAndView,@ModelAttribute Admin admin){
		modelAndView.setViewName(adminService.login(admin.getName(), admin.getPassword())?"/WEB-INF/content/manager/managehome.jsp":"/WEB-INF/content/manager/index.jsp");
		return modelAndView;
	}
	
	public ModelAndView getAllLecture(ModelAndView modelAndView){
		
		
		
		return modelAndView;
	}
	
	
}

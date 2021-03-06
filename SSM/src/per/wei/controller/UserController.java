package per.wei.controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import per.wei.entity.Admin;
import per.wei.entity.Student;
import per.wei.service.LectureService;
import per.wei.service.SelectlectureService;
import per.wei.service.UserService;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��23�� ����10:44:51   
*/
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private LectureService lectureService;
	
	@Autowired
	private Admin admin;
	
	@Autowired
	private SelectlectureService selectlectureService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(String username,String password ,HttpServletRequest request){
		Student user=userService.login(username);
		ModelAndView mView=new ModelAndView();
		String path=request.getServletContext().getRealPath("/files/");
		System.out.println(path);
		if (user==null) {
			request.setAttribute("error", "��δע��");
		}else {
			if (password.equals(user.getPassword())) {
				request.getSession().setAttribute("user", user.getStucard());
				mView.setViewName("redirect:/lecture/home");
				return mView;
			}else {
				request.setAttribute("error","�������");
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
	@RequestMapping("/upload")
	public ModelAndView upload(@RequestParam("file") MultipartFile file,ModelAndView modelAndView,HttpServletRequest request) throws Exception{
		String path=request.getServletContext().getRealPath("/files/");
		System.out.println(path);
		String filename=file.getOriginalFilename();
		File filepath=new File(path, filename);
		if (!filepath.getParentFile().exists()) {
			filepath.getParentFile().mkdirs();
		}
		modelAndView.setViewName("/WEB-INF/content/upload.jsp");
		file.transferTo(new File(path+File.separator+filename));
		return modelAndView;
	}
	@RequestMapping("/uploadpage")
	public ModelAndView uploadpage(ModelAndView modelAndView){
		modelAndView.setViewName("/WEB-INF/content/upload.jsp");
		
		return modelAndView;
	}
}

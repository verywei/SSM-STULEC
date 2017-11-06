package per.wei.interceptor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月29日 下午4:49:19   
*/
public class AuthorityInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Pattern pattern=Pattern.compile("([\\s\\S]*)://([a-zA-Z0-9]*)(:[0-9]*)*/([a-zA-z0-9]*)(/([a-zA-z0-9]*))*");
		Matcher m=pattern.matcher(request.getRequestURL());
		if (m.find()){
          System.out.println(m.group(0));
          System.out.println(m.group(1));
          System.out.println(m.group(2));
          System.out.println(m.group(3));
          System.out.println(m.group(4));
          System.out.println(m.group(5));

      }
		if(request.getSession().getAttribute("user")==null){
			response.sendRedirect("/SSM/");
			return false;
		}
		else {
			return true;
		}
		
	}

}

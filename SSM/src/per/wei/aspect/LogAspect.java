package per.wei.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午6:13:35   
*/
@Aspect
public class LogAspect {
//	@AfterReturning(returning="rxt" ,pointcut="execution(* per.wei.service.imp.*.*(..))")
//	public void log(Object rxt){
//		Logger logger=Logger.getLogger(rxt.getClass());
//		logger.error("LogAspect打印日志");;
//	}
	@Before("execution(* per.wei.service.imp.*.*(..))")
	public void check(JoinPoint jop){
		System.out.println("LogAspect.check***"+jop.getTarget());
	}
}

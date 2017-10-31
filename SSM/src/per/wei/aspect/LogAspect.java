package per.wei.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����6:13:35   
*/
@Aspect
public class LogAspect {
//	@AfterReturning(returning="rxt" ,pointcut="execution(* per.wei.service.imp.*.*(..))")
//	public void log(Object rxt){
//		Logger logger=Logger.getLogger(rxt.getClass());
//		logger.error("LogAspect��ӡ��־");;
//	}
	@Before("execution(* per.wei.service.imp.*.*(..))")
	public void check(JoinPoint jop){
		System.out.println("LogAspect.check***"+jop.getTarget());
	}
}

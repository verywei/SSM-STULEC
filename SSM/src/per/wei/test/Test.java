package per.wei.test;

import org.springframework.stereotype.Component;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午6:21:04   
*/
@Component("test")
public class Test {
	public String show(){
		return "test";
	}
}

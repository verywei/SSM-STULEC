package per.wei.entity;

import org.springframework.stereotype.Component;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月30日 下午10:25:36   
*/
@Component
public class JoinLevels {
	String stu;
	String level;
	String payment;
	public String getStu() {
		return stu;
	}
	public void setStu(String stu) {
		this.stu = stu;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "JoinLevels [stu=" + stu + ", level=" + level + ", payment=" + payment + "]";
	}
	
}

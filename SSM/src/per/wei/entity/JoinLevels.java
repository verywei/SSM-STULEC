package per.wei.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��30�� ����10:25:36   
*/
@Component
public class JoinLevels implements Serializable{
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

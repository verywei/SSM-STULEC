package per.wei.entity;/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��31�� ����8:23:50   
*/

import java.sql.Timestamp;

public class SelectJoinLevels {
	String stu;
	String name;
	Timestamp date;
	String payment;
	public String getStu() {
		return stu;
	}
	public void setStu(String stu) {
		this.stu = stu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "SelectJoinLevels [stu=" + stu + ", name=" + name + ", date=" + date + ", payment=" + payment + "]";
	}
	
}

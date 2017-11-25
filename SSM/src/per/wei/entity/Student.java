package per.wei.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��23�� ����10:33:51   
*/
/*
 * ѧ��ʵ��
 */
@Component
public class Student implements Serializable{
	String stucard;
	String name;
	String sex;
	String idcard;
	String comeyear;
	String major;
	String password;
	public String getStucard() {
		return stucard;
	}
	public void setStucard(String stucard) {
		this.stucard = stucard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getComeyear() {
		return comeyear;
	}
	public void setComeyear(String comeyear) {
		this.comeyear = comeyear;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [stucard=" + stucard + ", name=" + name + ", sex=" + sex + ", idcard=" + idcard + ", comeyear="
				+ comeyear + ", major=" + major + ", password=" + password + "]";
	}
	
}

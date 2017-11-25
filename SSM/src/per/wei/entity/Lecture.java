package per.wei.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����8:51:09   
*/
/*
 * �γ�ʵ��
 */
@Component
public class Lecture implements Serializable{
	private String id;
	private String name;
	private String credit;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Lecture [id=" + id + ", name=" + name + ", credit=" + credit + "]";
	}
	
}

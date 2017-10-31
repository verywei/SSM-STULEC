package per.wei.entity;

import org.springframework.stereotype.Component;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午8:51:09   
*/
/*
 * 课程实体
 */
@Component
public class Lecture {
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

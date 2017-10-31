package per.wei.entity;

import java.sql.Timestamp;

/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月30日 下午10:25:15   
*/
public class Levels {
	String id;
	String name;
	double money;
	Timestamp date;
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
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Levels [id=" + id + ", name=" + name + ", money=" + money + ", date=" + date + "]";
	}
	
}

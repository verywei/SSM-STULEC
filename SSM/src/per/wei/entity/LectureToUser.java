package per.wei.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��27�� ����10:09:27   
*/
@Component
public class LectureToUser implements Serializable{
	private String lec;
	private String stu;
	private String  score;
	private String name ; 
	private String  credit;
	public String getLec() {
		return lec;
	}
	public void setLec(String lec) {
		this.lec = lec;
	}
	public String getStu() {
		return stu;
	}
	public void setStu(String stu) {
		this.stu = stu;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
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
		return "LectureToUser [lec=" + lec + ", stu=" + stu + ", score=" + score + ", name=" + name + ", credit="
				+ credit + "]";
	}
	
}

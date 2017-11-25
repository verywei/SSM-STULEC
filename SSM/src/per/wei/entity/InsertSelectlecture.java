package per.wei.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��29�� ����5:15:19   
*/
/*
 * ���ѡ��ʵ��
 */
@Component
public class InsertSelectlecture implements Serializable{
	String lecture;
	String student;
	String score;
	public String getLecture() {
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "InsertSelectlecture [lecture=" + lecture + ", student=" + student + ", score=" + score + "]";
	}
	
}

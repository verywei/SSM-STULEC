package per.wei.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����9:40:42   
*/
/*
 * ��ȡѡ��ʵ��
 */
@Component
public class Selectlecture implements Serializable{
	Lecture lecture;
	Student student;
	String score;
	public Lecture getLecture() {
		return lecture;
	}
	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
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
		return "Selectlecture [lecture=" + lecture + ", student=" + student + ", score=" + score + "]";
	}
	
	
}

package per.wei.entity;/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午9:40:42   
*/
/*
 * 获取选课实体
 */
public class Selectlecture {
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

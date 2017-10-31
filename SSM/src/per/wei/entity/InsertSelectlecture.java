package per.wei.entity;/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月29日 下午5:15:19   
*/
/*
 * 添加选课实体
 */
public class InsertSelectlecture {
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

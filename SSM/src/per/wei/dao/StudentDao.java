package per.wei.dao;
/** 
* @author  ���� : wangwev
* @date ����ʱ�䣺2017��10��26�� ����9:42:40   
*/

import per.wei.entity.Student;

public interface StudentDao {
	public Student selectByStucard(String stucard);
}

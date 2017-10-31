package per.wei.dao;
/** 
* @author  作者 : wangwev
* @date 创建时间：2017年10月26日 下午9:42:40   
*/

import per.wei.entity.Student;

public interface StudentDao {
	public Student selectByStucard(String stucard);
}

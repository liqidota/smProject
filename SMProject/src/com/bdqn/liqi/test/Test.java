package com.bdqn.liqi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.liqi.entity.Student;
import com.bdqn.liqi.service.IStudentService;

/**
 * test
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService iStudentService = (IStudentService) applicationContext.getBean("StudentServiceImpl");
		Student student =new Student();
		student.setStu_name("»¡È¦Çò");
		student.setStu_age(100);
		iStudentService.add(student);
	}
}

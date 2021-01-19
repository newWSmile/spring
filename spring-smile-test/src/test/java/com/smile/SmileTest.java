package com.smile;

import com.smile.po.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：Smile(wangyajun)
 * @date ：Created in 2021/1/19 16:18
 * @description：
 */
public class SmileTest {



	@Test
	public void test1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("smile-application.xml");
		Student student = context.getBean(Student.class);
		System.out.println(student);
		System.out.println(student.getName());


	}

}

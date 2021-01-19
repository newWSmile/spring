package com.smile.po;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author ：Smile(wangyajun)
 * @date ：Created in 2021/1/19 16:12
 * @description：
 */
public class Student {

	private String name ;

	private Integer age;




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("age=" + age)
				.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(name, student.name) &&
				Objects.equals(age, student.age);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}

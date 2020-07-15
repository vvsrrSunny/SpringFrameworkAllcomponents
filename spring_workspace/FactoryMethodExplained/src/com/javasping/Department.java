package com.javasping;

import java.util.List;

public class Department {
	String name;
	List<Student> students;
	String hod;
	private static Department department = new Department();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

	static Department DepartmentFactoryMethod() {
		return department;

	}

	public String departmentInfo() {
		return "Department [name=" + name + ", students=" + students + ", hod=" + hod + "]";

	}

	void listStudents() {
		for (Student student : students) {
			System.out.println(student.getName());
		}
	}

}

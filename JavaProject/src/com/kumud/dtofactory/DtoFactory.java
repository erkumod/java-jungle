package com.kumud.dtofactory;

import java.util.ArrayList;
import java.util.List;

import com.kumud.dto.Student;

public class DtoFactory {
	
	public List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		Student student_1 = new Student("kumud", "delhi", 1);
		Student student_2 = new Student("raju", "delhi", 2);
		Student student_3 = new Student("vipin", "merrut", 3);

		studentList.add(student_1);
		studentList.add(student_2);
		studentList.add(student_3);
		return studentList;
	}
}

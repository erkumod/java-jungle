package com.kumud.stream;

import java.util.List;

import java.util.stream.Collectors;

import com.kumud.dto.Student;
import com.kumud.dtofactory.DtoFactory;

public class JavaStream {

	public static void main(String[] args) {
		JavaStream javaStream = new JavaStream();
		DtoFactory dtoFactory = new DtoFactory();

		// get list of all student
		List<Student> studentList = dtoFactory.getStudentList();

		// get student who lives in delhi

		List<Student> delStudent = javaStream.getDelhiStudents(studentList);
		// print name of student which from city delhi
		delStudent.forEach(st -> System.out.println("name is -- " + st.getName()));

		// print student name who lives in city delhi
		List<String> studentFromDelhi = javaStream.getStudentNamesFromDelhi(studentList);
		studentFromDelhi.forEach(st -> System.out.println("student name is -- " + st));
	}

	private List<Student> getDelhiStudents(List<Student> studentList) {
		return studentList.stream().filter(student -> student.getCity().equals("delhi")).collect(Collectors.toList());
	}

	private List<String> getStudentNamesFromDelhi(List<Student> studentList) {
		// using stream > filter > map > collect = to collect into another list of type
		return studentList.stream().filter(student -> student.getCity().equals("delhi")).map(Student::getName)
				.collect(Collectors.toList());
	}

}

package com.kumud.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.kumud.dto.Student;
import com.kumud.dtofactory.DtoFactory;

public class JavaStream {
	
	public static void main(String [] args) {
		JavaStream javaStream=new JavaStream();
		DtoFactory dtoFactory= new DtoFactory();
	
		// get list of all student
		List<Student> studentList= dtoFactory.getStudentList();
		
		//get student who lives in delhi
		
		List<Student> delStudent=javaStream.getDelhiStudents(studentList);
		//print name of student which from city delhi
		delStudent.forEach(st -> System.out.println("name is -- "+st.getName()));
	
	}
	private List<Student> getDelhiStudents(List<Student> studentList){
		return studentList.stream().filter(student -> student.getCity().equals("delhi")).collect(Collectors.toList());
	}
	
	

}

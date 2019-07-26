package com.kumud.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.kumud.dto.Student;

public class JavaStream {
	
	public static void main(String [] args) {
		JavaStream javaStream=new JavaStream();
		
		Student student_1= new Student("kumud","delhi",1);
		Student student_2= new Student("raju","delhi",2);
		Student student_3= new Student("vipin","merrut",3);
		
		List<Student> studentList= new ArrayList<Student>();
		studentList.add(student_1);
		studentList.add(student_2);
		studentList.add(student_3);
		
		//get student who lives in delhi
		
		List<Student> delStudent=javaStream.getDelhiStudents(studentList);
		//print name of student which from city delhi
		delStudent.forEach(st -> System.out.println("name is -- "+st.getName()));
	
	}
	private List<Student> getDelhiStudents(List<Student> studentList){
		return studentList.stream().filter(student -> student.getCity().equals("delhi")).collect(Collectors.toList());
	}

}

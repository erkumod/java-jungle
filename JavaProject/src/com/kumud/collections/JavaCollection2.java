package com.kumud.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kumud.dto.Student;
import com.kumud.dtofactory.DtoFactory;

public class JavaCollection2 {
	public static void main(String[] args) {
		DtoFactory dtoFactory = new DtoFactory();
		List<Student>  studentList= dtoFactory.getStudentList();
		
		// () -> () If you have single statement and expression in lambda fucntion 
		Collections.sort(studentList , (Student st1, Student st2) -> st1.getName().compareTo(st2.getName()));
		
		//print
		
		studentList.forEach(student -> System.out.println("the name is "+student.getName()));
	}
	
}

package com.kumud.collections;

import java.util.Collections;
import java.util.List;

import com.kumud.dto.Student;
import com.kumud.dtofactory.DtoFactory;

public class JavaCollection3 {

	public static void main(String [] args) {
		
		DtoFactory dtoFactory = new DtoFactory();
		List<Student>  studentList= dtoFactory.getStudentList();
		
		// 1. Sort
		Collections.sort(studentList , (st1, st2) -> {System.out.println("kumud");return st1.getName().compareTo(st2.getName()); });
		
		//print
		
		studentList.forEach(student -> System.out.println("the name is "+student.getName()));
	}
}

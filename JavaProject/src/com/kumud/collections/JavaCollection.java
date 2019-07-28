package com.kumud.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kumud.dto.Student;
import com.kumud.dtofactory.DtoFactory;

public class JavaCollection {

	public static void main(String[] args) {
		DtoFactory dtoFactory = new DtoFactory();
		List<Student>  studentList= dtoFactory.getStudentList();
		
		// 1. Sort
		Collections.sort(studentList , new Comparator<Student>() {
			public int compare(Student st1, Student st2) {
				return st2.getName().compareTo(st1.getName());
			}
		});
		
		//print
		
		studentList.forEach(student -> System.out.println("the name is "+student.getName()));
	}
	
}

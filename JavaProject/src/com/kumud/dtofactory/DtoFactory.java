package com.kumud.dtofactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kumud.dto.Employee;
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
	
	public List<Employee> getEmployeeList() {
		Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
        Employee e6 = new Employee(6,15,"M","David","Feezor");
        Employee e7 = new Employee(7,68,"F","Melissa","Roy");
        Employee e8 = new Employee(8,79,"M","Alex","Gussin");
        Employee e9 = new Employee(9,15,"F","Neetu","Singh");
        Employee e10 = new Employee(10,45,"M","Naveen","Jain");
         
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
        return employeeList;
	}
}

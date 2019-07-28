package com.java.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.kumud.dto.Employee;
import com.kumud.dtofactory.DtoFactory;

//Predicate is functional interface which is used for traget to lambda expression
public class JavaPredicates {

	public static void main(String[] args) {
		
		DtoFactory dtoFactory = new DtoFactory();
		
		List<Employee> employeeList=dtoFactory.getEmployeeList();
		//Predicate1
		Predicate<Employee> p1= p -> p.getAge()>2 && p.getGender().equals("M");
		
		List<Employee> newListWithPredicate= employeeList.stream().filter(p1).collect(Collectors.toList());
		
		newListWithPredicate.forEach(employee -> System.out.println("Employee  "+employee));
		
		
	}
}

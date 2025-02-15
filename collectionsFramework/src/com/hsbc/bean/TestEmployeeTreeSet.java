package com.hsbc.bean;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeTreeSet {
	public static void main(String[] args) {
		System.out.println("-------Adding----------");
		Set<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee(102, "Alex", 20000, "Finance"));
		employees.add(new Employee(101, "Charles", 40000, "Finance"));
		employees.add(new Employee(100, "Bruce", 50000, "Sales"));
		employees.add(new Employee(104, "David", 30000, "Sales"));
		employees.add(new Employee(104, "Edward", 60000, "Sales"));
		System.out.println("Size: "+employees.size());
		System.out.println("--- Iterating ----");
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}

}

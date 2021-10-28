package com.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         // add 5 employees to list

		System.out.println("Employee Names ");
		List<Employee> empList = Arrays.asList(new Employee(1, "Kee", "Bangalore"), new Employee(2, "Dora", "Chennai"),
				new Employee(3, "Jerry", "Hyderabad"), new Employee(4, "Beam", "Hyderabad"),
				new Employee(5, "ChingChang", "Singapore"));

		// print all employees - forEach

		for (Employee employee : empList) {
			System.out.println(employee);
		}

		System.out.println();

		//
		// print employees based on city - stream, filter, forEach

		System.out.println("Based on City ");
		List<Employee> emp = empList.stream().filter(empl -> empl.getCity().startsWith("H"))
				.collect(Collectors.toList());

		for (Employee e : emp) {
			System.out.println(e);
		}
		System.out.println();

		// print all employees of sorting - stream, sorted(lambda), forEach

		System.out.println("Sorting Names");
		List<Employee> sortedList = empList.stream()
				.sorted((i1, i2) -> ((Comparable<String>) i1.getName()).compareTo(i2.getName()))
				.collect(Collectors.toList());

		for (Employee sorted : sortedList) {
			System.out.println(sorted);
		}

		System.out.println();

		// print one employee by id, if not available throw runtime- stream, filter,
		// findFirst,orelsethrow
		
		System.out.println("print one employee id ");
		try {
			Employee empid = empList.stream().filter(empl -> empl.getEmpid() == 1).findFirst()
					.orElseThrow(() -> new Exception("Not found"));
			System.out.println( empid);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println();
		
		// print all employee names that start with K , if not available print ("not in
		// first place") stream, filter, findFirst,orelse

		System.out.println("Print start with K");
		try {
			Employee empid = empList.stream().filter(empl -> empl.getName().startsWith("K")).findFirst()
					.orElseThrow(() -> new Exception("Not found"));
			System.out.println(empid);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

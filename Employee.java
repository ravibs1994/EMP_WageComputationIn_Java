package com.brigelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Employee {

	public static void main(String[] args) {
		// object created
		int empRatePerHour = 0;
		int fullDayHour = 0;
		int partDayHour = 0;
		int maxDays = 0;
		int totalWages = 0;
		String company = "";
		String choice = "";
		Scanner sc = new Scanner(System.in);
		// HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		// Set entrySet = h1.entrySet();
		// Using Arraylist Storing multiple Companies Wages instead of Hashmap
		ArrayList<Object> al = new ArrayList<Object>();
		// method call
		do {
			int random = (int) Math.floor(Math.random() * 10) % 3;
			switch (random) {
			case 0:
				System.out.println(" Enter Company Name ");
				company = sc.next();
				System.out.println("Enter empRatePer Hour ");
				empRatePerHour = sc.nextInt();
				System.out.println("Enter Full day Hour ");
				fullDayHour = sc.nextInt();
				System.out.println("Enter partime day Hour ");
				partDayHour = sc.nextInt();
				System.out.println("Enter MaxDays ");
				maxDays = sc.nextInt();
				EmpWageBuilder1 c1 = new EmpWageBuilder1(company, empRatePerHour, fullDayHour, partDayHour, maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR,
				// PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				totalWages = c1.CalculateEmpWages();
				break;
			case 1:
				System.out.println(" Enter Company Name ");
				company = sc.next();
				System.out.println("Enter empRatePer Hour ");
				empRatePerHour = sc.nextInt();
				System.out.println("Enter Full day Hour ");
				fullDayHour = sc.nextInt();
				System.out.println("Enter partime day Hour ");
				partDayHour = sc.nextInt();
				System.out.println("Enter MaxDays ");
				maxDays = sc.nextInt();
				EmpWageBuilder1 c2 = new EmpWageBuilder1(company, empRatePerHour, fullDayHour, partDayHour, maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR,
				// PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				totalWages = c2.CalculateEmpWages();
				break;
			case 2:
				System.out.println(" Enter Company Name ");
				company = sc.next();
				System.out.println("Enter empRatePer Hour ");
				empRatePerHour = sc.nextInt();
				System.out.println("Enter Full day Hour ");
				fullDayHour = sc.nextInt();
				System.out.println("Enter partime day Hour ");
				partDayHour = sc.nextInt();
				System.out.println("Enter MaxDays ");
				maxDays = sc.nextInt();
				EmpWageBuilder1 c3 = new EmpWageBuilder1(company, empRatePerHour, fullDayHour, partDayHour, maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR,PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				totalWages = c3.CalculateEmpWages();
				break;
			}
			// h1.put(EmpWageBuilder1.companyName, totalWages);
			al.add(company);
			al.add(totalWages);
			// Obtaining an iterator for the entry set
			Iterator it = al.iterator();
			while (it.hasNext()) {
				System.out.print(it.next() + " ,");
			}
			System.out.println(" ");
			System.out.println("Do you want to Continue Y/N");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("Thank you..");
		sc.close();
	}
}

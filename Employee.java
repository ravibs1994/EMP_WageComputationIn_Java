package com.brigelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
		ArrayList<Object> al = new ArrayList<Object>();
		// HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		// Set entrySet = h1.entrySet();
		// Using Arraylist Storing multiple Companies Wages instead of Hashmap

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

				Iterator it = c1.CalculateEmpWages().iterator();
				while (it.hasNext()) {
					al.add(it.next());
				}
				c1.totalWagesByCompany();
				System.out.println(" ");
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
				Iterator it2 = c2.CalculateEmpWages().iterator();
				while (it2.hasNext()) {
					al.add(it2.next());
				}
				c2.totalWagesByCompany();
				System.out.println(" ");
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
				Iterator it3 = c3.CalculateEmpWages().iterator();
				while (it3.hasNext()) {
					al.add(it3.next());
				}
				c3.totalWagesByCompany();
				System.out.println(" ");
				break;
			}
			Iterator it4 = al.iterator();
			while (it4.hasNext()) {
				System.out.print("  " + it4.next());
			}
			System.out.println(" ");
			System.out.println("Do you want to Continue Y/N");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("Thank you..");
		sc.close();
	}
}

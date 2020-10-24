package com.brigelabz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	static String companyName;
	int wages_Per_Hour;
	int full_Day_Hour;
	int part_Time_Day_Hour;
	int days_In_Month;

	public Employee(String companyName, int wages_Per_Hour, int full_Day_Hour, int part_Time_Day_Hour,
			int days_In_Month) {
		Employee.companyName = companyName;
		this.wages_Per_Hour = wages_Per_Hour;
		this.full_Day_Hour = full_Day_Hour;
		this.part_Time_Day_Hour = part_Time_Day_Hour;
		this.days_In_Month = days_In_Month;
	}

//define a method
	public int CalculateEmpWages() {
//Local data Members
		int totalWages = 0;
		int TotalWagesAsperCondition = 0;
		int totalWorkingHour = 0;
		int workingDays = 1;
//Calculate Wages till a condition of total working hours or days is reached for a month
		while (totalWorkingHour <= 100 && workingDays <= days_In_Month) {
//generate random value 
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				totalWages = wages_Per_Hour * full_Day_Hour;
				totalWorkingHour = totalWorkingHour + full_Day_Hour;
				TotalWagesAsperCondition += totalWages;
				break;
			case 2:
				totalWages = wages_Per_Hour * part_Time_Day_Hour;
				totalWorkingHour = totalWorkingHour + part_Time_Day_Hour;
				TotalWagesAsperCondition += totalWages;
				break;
			default:
				workingDays--;
			}
			workingDays++;
		}
		return TotalWagesAsperCondition;
	}// CalculateEmpWages() method close

	public static void main(String[] args) {
//object created
		int empRatePerHour = 0;
		int fullDayHour = 0;
		int partDayHour = 0;
		int maxDays = 0;
		int totalWages = 0;
		String choice = "";
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		Set entrySet = h1.entrySet();
//method call
		do {
			int random = (int) Math.floor(Math.random() * 10) % 3;
			switch (random) {
			case 0:
				System.out.println(" Enter Company Name ");
				companyName = sc.next();
				System.out.println("Enter empRatePer Hour ");
				empRatePerHour = sc.nextInt();
				System.out.println("Enter Full day Hour ");
				fullDayHour = sc.nextInt();
				System.out.println("Enter partime day Hour ");
				partDayHour = sc.nextInt();
				System.out.println("Enter MaxDays ");
				maxDays = sc.nextInt();
				Employee c1 = new Employee(companyName, empRatePerHour, fullDayHour, partDayHour, maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR,
																											// PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				totalWages = c1.CalculateEmpWages();
				break;
			case 1:
				System.out.println(" Enter Company Name ");
				companyName = sc.next();
				System.out.println("Enter empRatePer Hour ");
				empRatePerHour = sc.nextInt();
				System.out.println("Enter Full day Hour ");
				fullDayHour = sc.nextInt();
				System.out.println("Enter partime day Hour ");
				partDayHour = sc.nextInt();
				System.out.println("Enter MaxDays ");
				maxDays = sc.nextInt();
				Employee c2 = new Employee(companyName, empRatePerHour, fullDayHour, partDayHour, maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR,
																											// PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				totalWages = c2.CalculateEmpWages();
				break;
			case 2:
				System.out.println(" Enter Company Name ");
				companyName = sc.next();
				System.out.println("Enter empRatePer Hour ");
				empRatePerHour = sc.nextInt();
				System.out.println("Enter Full day Hour ");
				fullDayHour = sc.nextInt();
				System.out.println("Enter partime day Hour ");
				partDayHour = sc.nextInt();
				System.out.println("Enter MaxDays ");
				maxDays = sc.nextInt();
				Employee c3 = new Employee(companyName, empRatePerHour, fullDayHour, partDayHour, maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR,
																											// PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				totalWages = c3.CalculateEmpWages();
				break;
			}
			h1.put(companyName, totalWages);
			// Obtaining an iterator for the entry set
			Iterator it = entrySet.iterator();
			while (it.hasNext()) {
				Map.Entry me = (Map.Entry) it.next();
				System.out.println("Company Name=: " + me.getKey() + " & " + " Total Wages: " + me.getValue());
			}
			System.out.println("Do you want to Continue Y/N");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("Thank you..");
		sc.close();
	}// main() method close
}// class close

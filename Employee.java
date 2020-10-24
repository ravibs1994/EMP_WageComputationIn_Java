package com.brigelabz;

import java.util.Scanner;

public class Employee {
//define a method
	public void CalculateEmpWages(int WAGES_PER_HOUR, int FULL_DAY_HOUR, int PART_TIME_DAY_HOUR, int DAYS_IN_MONTH) {
//Local data Members
		int totalWages = 0;
		int TotalWagesAsperCondition = 0;
		int totalWorkingHour = 0;
		int workingDays = 1;
//Calculate Wages till a condition of total working hours or days is reached for a month
		while (totalWorkingHour <= 100 && workingDays <= DAYS_IN_MONTH) {
//generate random value 
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				totalWages = WAGES_PER_HOUR * FULL_DAY_HOUR;
				totalWorkingHour = totalWorkingHour + FULL_DAY_HOUR;
				TotalWagesAsperCondition += totalWages;
				break;
			case 2:
				totalWages = WAGES_PER_HOUR * PART_TIME_DAY_HOUR;
				totalWorkingHour = totalWorkingHour + PART_TIME_DAY_HOUR;
				TotalWagesAsperCondition += totalWages;
				break;
			default:
				workingDays--;
			}
			workingDays++;
		}
		System.out.println("Total Wages As per Given condition = " + TotalWagesAsperCondition);
	}// CalculateEmpWages() method close

	public static void main(String[] args) {
//object created
		int empRatePerHour=0;
		int fullDayHour=0;
		int partDayHour=0;
		int maxDays=0;
		String choice = "";
		Scanner sc = new Scanner(System.in);
//method call
		do {
			Employee emp = new Employee();
			int random = (int) Math.floor(Math.random() * 10) % 3;
			switch (random) {
			case 0:
				 System.out.println(" Infosys ");
				 System.out.println("Enter empRatePer Hour ");
				 empRatePerHour=sc.nextInt();
				 System.out.println("Enter Full day Hour ");
				 fullDayHour=sc.nextInt();
				 System.out.println("Enter partime day Hour ");
				 partDayHour=sc.nextInt();
				 System.out.println("Enter MaxDays ");
				 maxDays=sc.nextInt();
				 emp.CalculateEmpWages(empRatePerHour,fullDayHour,partDayHour,maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR, PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				break;
			case 1:
				 System.out.println("TCS");
				 System.out.println("Enter empRatePer Hour ");
				 empRatePerHour=sc.nextInt();
				 System.out.println("Enter Full day Hour ");
				 fullDayHour=sc.nextInt();
				 System.out.println("Enter partime day Hour ");
				 partDayHour=sc.nextInt();
				 System.out.println("Enter MaxDays ");
				 maxDays=sc.nextInt();
				 emp.CalculateEmpWages(empRatePerHour,fullDayHour,partDayHour,maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR, PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				break;
			case 2:
				  System.out.println("IBM");
				  System.out.println("Enter empRatePer Hour ");
				  empRatePerHour=sc.nextInt();
				  System.out.println("Enter Full day Hour ");
				  fullDayHour=sc.nextInt();
				  System.out.println("Enter partime day Hour ");
				  partDayHour=sc.nextInt();
				  System.out.println("Enter MaxDays ");
				  maxDays=sc.nextInt();
				  emp.CalculateEmpWages(empRatePerHour,fullDayHour,partDayHour,maxDays);// WAGES_PER_HOUR,FULL_DAY_HOUR, PART_TIME_DAY_HOUR,DAYS_IN_MONTH
				break;
			}
			System.out.println("Do you want to Continue Y/N");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
		System.out.println("Thank you..");
		sc.close();
	}// main() method close
}// class close

package com.brigelabz;

public class Employee {

	public static void main(String[] args) {
		int WAGES_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int PART_TIME_DAY_HOUR = 4;
		int totalWages;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case 1:
			totalWages = WAGES_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Total Daily Wages = " + totalWages);
			break;
		case 2:
			totalWages = WAGES_PER_HOUR * PART_TIME_DAY_HOUR;
			System.out.println("Total Daily Wages = " + totalWages);
			break;
		default:
			System.out.println("Employee is Absent ");
		}

	}
}

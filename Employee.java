package com.brigelabz;

public class Employee {

	public static void main(String[] args) {

		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGES_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int PART_TIME_DAY_HOUR = 4;
		int totalWages;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME) {
			totalWages = WAGES_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Total Daily Wages = " + totalWages);
		} else if (empCheck == IS_PART_TIME) {
			totalWages = WAGES_PER_HOUR * PART_TIME_DAY_HOUR;
			System.out.println("Total Daily Wages = " + totalWages);
		} else {
			System.out.println("Employee is Absent ");
		}

	}
}

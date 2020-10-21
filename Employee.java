package com.brigelabz;

public class Employee {

	public static void main(String[] args) {

		int IS_FULL_TIME = 1;
		int WAGES_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			int total_Wages = WAGES_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Total Daily Wages = " + total_Wages);
		} else {
			System.out.println("Employee Is Absent ");

		}

	}
}

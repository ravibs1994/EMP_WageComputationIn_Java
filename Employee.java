package com.brigelabz;

public class Employee {
//define a method
	public void CalculateEmpWages() {
//Local data Members
		final int WAGES_PER_HOUR = 20;
		final int FULL_DAY_HOUR = 8;
		final int PART_TIME_DAY_HOUR = 4;
		final int DAYS_IN_MONTH = 20;
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
	}//CalculateEmpWages() method close

	public static void main(String[] args) {
//object created
		Employee emp = new Employee();
//method call
		emp.CalculateEmpWages();
	}//main() method close
}//class close

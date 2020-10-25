package com.brigelabz;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpWageBuilder1 implements EmpInterface {
	String companyName;
	int wages_Per_Hour;
	int full_Day_Hour;
	int part_Time_Day_Hour;
	int days_In_Month;
	ArrayList<Object> al = new ArrayList<Object>();

	public EmpWageBuilder1(String companyName, int wages_Per_Hour, int full_Day_Hour, int part_Time_Day_Hour,
			int days_In_Month) {
		this.companyName = companyName;
		this.wages_Per_Hour = wages_Per_Hour;
		this.full_Day_Hour = full_Day_Hour;
		this.part_Time_Day_Hour = part_Time_Day_Hour;
		this.days_In_Month = days_In_Month;
	}

//define a method
	public ArrayList<Object> CalculateEmpWages() {
//Local data Members
		int totalWages = 0;
		int TotalWagesAsperCondition = 0;
		int totalWorkingHour = 0;
		int workingDays = 1;
		al.add(companyName);
//Calculate Wages till a condition of total working hours or days is reached for a month
		while (totalWorkingHour <= 100 && workingDays <= days_In_Month) {
//generate random value 
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case 1:
				totalWages = wages_Per_Hour * full_Day_Hour;
				totalWorkingHour = totalWorkingHour + full_Day_Hour;
				al.add(totalWages);
				TotalWagesAsperCondition += totalWages;
				break;
			case 2:
				totalWages = wages_Per_Hour * part_Time_Day_Hour;
				totalWorkingHour = totalWorkingHour + part_Time_Day_Hour;
				al.add(totalWages);
				TotalWagesAsperCondition += totalWages;
				break;
			default:
				workingDays--;
			}
			workingDays++;
		}
		al.add(TotalWagesAsperCondition);
		// Iterator it =al.iterator();
		// while (it.hasNext()) {
		// System.out.print(it.next());
		// }
		// System.out.println(" ");
		return al;
	}// CalculateEmpWages() method close

}
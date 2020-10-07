package com.assignments;

public class UC5 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int emp_rate=20;
	public static final int working_days=20;
	
	public static void main(String[] args) {
		  int emp_wage=0;
		  int emp_hrs=0;
		 for(int day=0;day<working_days;day++) {
		  int temp_emp_wage=0;
		  int empcheck=(int) Math.floor(Math.random()*10)%3;
		  switch(empcheck) {
		  case IS_PART_TIME:
			  emp_hrs=4;
			  break;
		  case IS_FULL_TIME:
			  emp_hrs=8;
			  break;
		  default:
			  emp_hrs=0;
		  }
		  temp_emp_wage=emp_rate*emp_hrs;
		  System.out.println("Employee Wage: "+ temp_emp_wage);
          emp_wage=emp_wage+temp_emp_wage;
		 }
		 System.out.println("Total Wage: "+ emp_wage);
	}
}

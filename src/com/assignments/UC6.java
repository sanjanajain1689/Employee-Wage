package com.assignments;

public class UC6 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int wage_per_hour=20 ;
 public static void main(String[] args) {
	 int emp_hrs=0;
	 int hours=0;
	 int emp_wage=0;
	 
	for(int day=0;day<20&&hours<100;day++) { 
	 int empcheck=(int)Math.floor(Math.random()*10)%3;
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
	 hours+=emp_hrs;
	 System.out.println("Day#: "+day+" Emp Hours:  "+hours);
	}
	emp_wage=hours*wage_per_hour;
	System.out.println("Employee Wage: "+emp_wage);
  }
}

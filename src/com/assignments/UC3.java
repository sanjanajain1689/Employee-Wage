package com.assignments;

public class UC3 {
	public static void main(String[] args) {
		  int IS_PART_TIME=1;
		  int IS_FULL_TIME=2;
		  int emp_rate=20;
		  int emp_wage=0;
		  int emp_hrs=0;
		  double empcheck=Math.floor(Math.random()*10)%3;
		  if(empcheck==IS_PART_TIME)
			  emp_hrs=4;
		  else if(empcheck==IS_FULL_TIME)
			  emp_hrs=8;
		  else
			  emp_hrs=0;
		  emp_wage=emp_rate*emp_hrs;
		  System.out.println("Employee Wage: "+ emp_wage);

			}
}

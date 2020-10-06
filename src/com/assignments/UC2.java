/**
 * 
 */
package com.assignments;

/**
 * @author hp
 *
 */
public class UC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME=1;
		int emp_rate_per_hour=20;
		int emp_hrs=0;
		int emp_wage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME) 
			emp_hrs=8;
		else
			emp_hrs=0;
		emp_wage=emp_rate_per_hour*emp_hrs;
		System.out.println("Employee Wage: "+emp_wage);
	}

}

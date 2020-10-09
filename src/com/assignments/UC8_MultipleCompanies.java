package com.assignments;


public class UC8_MultipleCompanies {
	
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	
    public static int Emp_Wage(String company_name,int wage_per_hour,int working_days,int max_working_hour_per_month) {
        System.out.println("Employee Wage calculation for- "+company_name);
    	int emp_hrs=0;
   	    int hours=0;
   	    int emp_wage=0;
   	    for(int day=0;day<working_days && hours<max_working_hour_per_month;day++) { 
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
    	return emp_wage;
    }
    
	public static void main(String[] args) {
		System.out.println("Total Employee Wage Per Month: "+Emp_Wage("Accenture",20,20,100));
		System.out.println("Total Employee Wage Per Month: "+Emp_Wage("Cognizant",30,20,50));
	}

}

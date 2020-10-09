package com.assignments;

public class UC7ClassMethod {
 static final int IS_PART_TIME=1;
 static final int IS_FULL_TIME=2;
 static final int WORKING_DAYS=20;
 static final int HOURLY_RATE=20;
  
 public static int random_check() {
	 int hours=0;
	 int cum_hours=0;
	 for(int day=0;cum_hours<100 && day<WORKING_DAYS;day++) {
	 int emp_check=(int)Math.floor(Math.random()*10)%3;
	 switch(emp_check) {
	 case(IS_PART_TIME):
		 hours=4;
	     break;
	 case(IS_FULL_TIME):
		 hours=8;
	     break;
	 default:
		 hours=0;
		 break;
		 }
	   cum_hours=cum_hours+hours;
	   System.out.println("Day#"+day +" Total Hours: "+cum_hours);
	  }
	 return cum_hours;
 }
 
 public static int emp_wage(){
 int total_wage=random_check()*HOURLY_RATE;
 return(total_wage); 
 }
 
 public static void main(String[] args) {
	System.out.println("Welcom to Employee Wage Computation");
	System.out.println("Total Employee Wage: "+emp_wage());
}
}
 

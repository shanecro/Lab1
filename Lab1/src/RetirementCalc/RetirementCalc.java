package RetirementCalc;

// This lab was completed with Shane Croce, Mitchell Land, Ahmed Joban 

import java.util.Scanner;

public class RetirementCalc {
	public static void main(){
		double years_working;
		double returnBR; //the interest rate before retirement
		double years_retired;
		double returnAR; //the interest rate after retirement
		double required_income;
		double monthlySSI;
		double total_saving; 
		double save_monthly;
		
		Scanner reader = new Scanner(System.in); //
		System.out.print(" Enter the amount of years you want to work:");
		years_working = reader.nextDouble(); // next input read as Number of Years to work
		//rest of the statements define other values
		System.out.print(" Enter your annual return rate before retirement:");
		returnBR = reader.nextDouble();
		
		System.out.print(" Enter the amount of years retired:");
		years_retired = reader.nextDouble();
		
		System.out.print(" Enter the annual return after retirement");
		returnAR = reader.nextDouble();
		
		System.out.print(" Enter your required income:");
		required_income = reader.nextDouble();
		
		System.out.print(" Enter your monthly SSI:");
		monthlySSI = reader.nextDouble();
		
		
		total_saving = (required_income - monthlySSI) * ((1-(1/(Math.pow(1+(returnAR/100)/12, years_retired * 12 )))))/((returnAR/100)/12); //Total amount saves
		//Present Value Formula
		
		save_monthly = total_saving * (((returnBR/100)/12)/((Math.pow(1+(returnBR/100)/12, years_working*12))-1)); //Required Monthly Savings
		//PMT Formula

		
		System.out.printf(" In order to save %.2f , you must save   %.2f   every month.",total_saving , save_monthly) ;
	}
	}
	
	
		

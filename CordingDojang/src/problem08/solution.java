package problem08;

import java.util.Scanner;


public class solution {
	
	public static int day_of_year(int num) {
		int sum = 0;
		
		if(num%100==0) {
			if(num%400==0) {
				sum=366;
			}
			else {
				sum=365;
			}
		}
		else if(num%4==0) {
			sum=366;
		}
		else {
			sum=365;
		}	
		return sum;
	}
	
	public static int counter(int year, int month) {
		int sum=0;
		int[] day_366 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day_365 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(year%100==0) {
			if(year%400==0) { //2월 29일
				for(int i = month; i<12;i++) {
					sum+=day_366[i];
				}
			}
			else {       //2월 28일
				for(int i = month; i<12;i++) {
					sum+=day_365[i];
				}
			}
		}
		else if(year%4==0) { //2월 29일
			for(int i = month; i<12;i++) {
				sum+=day_366[i];
			}
		}
		else {   //2월 28일
			for(int i = month; i<12;i++) {
				sum+=day_365[i];
			}
		}			
		return sum;
	}
	
	public static int counting_start_date(int year, int month, int day) {
		int sum=0;
		int[] day_366 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day_365 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(year%100==0) {
			if(year%400==0) { //2월 29일
				for(int i = month; i<12;i++) {
					sum+=day_366[i];
				}
				sum+= (day_366[month-1]-day)  ;
			}
			else {       //2월 28일
				for(int i = month; i<12;i++) {
					sum+=day_365[i];
				}
				sum+=(day_365[month-1]-day)  ;
			}
		}
		else if(year%4==0) { //2월 29일
			for(int i = month; i<12;i++) {
				sum+=day_366[i];
			}
			sum+= (day_366[month-1]-day) ;
		}
		else {   //2월 28일
			for(int i = month; i<12;i++) {
				sum+=day_365[i];
			}
			sum+=(day_365[month-1]-day) ;
		}		
		return sum;
	}
	
	public static int counting_end_date(int year, int month, int day) {
		int sum=0;
		int[] day_366 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day_365 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(year%100==0) {
			if(year%400==0) { //2월 29일
				for(int i = 0; i < month-1 ; i++) {
					sum+=day_366[i];
				}
				sum+=day;
			}
			else {       //2월 28일
				for(int i = 0; i < month-1 ; i++) {
					sum+=day_365[i];
				}
				sum+=day;
			}
		}
		else if(year%4==0) { //2월 29일
			for(int i = 0; i < month-1 ; i++) {
				sum+=day_366[i];
			}
			sum+=day;
		}
		else {   //2월 28일
			for(int i = 0; i < month-1 ; i++) {
				sum+=day_365[i];
			}
			sum+=day;
		}	
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 날짜를 입력해주세요 : (예: 20190210)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int start_date = 0;
		int end_date = 0;
		
		if(a<b) {
			start_date = a;
			end_date = b;
		}
		else {
			start_date = b;
			end_date = a;
		}
		
			
		int sum = 0;
		
		//년, 월, 일 분해
		int start_day=start_date%100;
		int start = start_date/100;
		int start_month = start%100;
		int start_year = start/100;
		
		int end_day=end_date%100;
		int end = end_date/100;
		int end_month = end%100;
		int end_year = end/100;
		
		
		if(end_year-start_year==0) {
			if(end_month-start_month==0) {
				sum = end_day-start_day;				
			}
			else {				
				sum = counting_end_date(end_year, end_month, end_day)- counting_end_date(start_year, start_month, start_day);
			}
			
		}
		else if(end_year-start_year==1) {
			sum = counting_start_date(start_year, start_month, start_day) + counting_end_date(end_year, end_month, end_day);
			
		}
		else {
			sum = counting_start_date(start_year, start_month, start_day) + counting_end_date(end_year, end_month, end_day);
			
			for(int i=1; i< end_year - start_year-1; i++) {
				sum+= day_of_year(start_year+i);
			}			
		}
		
		System.out.println(a+" sub "+ b + " = " + sum);
		

	}

}



































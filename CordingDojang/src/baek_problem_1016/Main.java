package baek_problem_1016;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double min = scan.nextDouble();
		double max = scan.nextDouble();    
		
		//int형 단위내에 있으면 따로 계산하고 int형 밖은 따로 계산!
		
		int sqrt_min = (int) Math.sqrt(min);
		int sqrt_max = (int) Math.sqrt(max);
		
		double cnt = max-min+1;
		
		//for(int i=min; i<=max ; i++) {  //입력받은 min부터 max까지 다 검사
		while(min<=max) {
			double i = min;
			if (i==1){
				continue;
			}
			//숫자가 하나 들어오면
			else {				
				for(int j=sqrt_min+1; j<=sqrt_max;j++) {
					if(i%(Math.pow(j, 2))==0) {
						System.out.println(Math.pow(j, 2));
						cnt-=1;
						break;
					}
					
				}				
			}
			min++;
		}
		System.out.println(cnt);
	}
}

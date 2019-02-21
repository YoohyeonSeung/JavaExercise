package baek_problem_1016;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double min = scan.nextDouble();
		double max = scan.nextDouble();    
		
		//int�� �������� ������ ���� ����ϰ� int�� ���� ���� ���!
		
		int sqrt_min = (int) Math.sqrt(min);
		int sqrt_max = (int) Math.sqrt(max);
		
		double cnt = max-min+1;
		
		//for(int i=min; i<=max ; i++) {  //�Է¹��� min���� max���� �� �˻�
		while(min<=max) {
			double i = min;
			if (i==1){
				continue;
			}
			//���ڰ� �ϳ� ������
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

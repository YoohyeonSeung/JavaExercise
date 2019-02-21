package baek_problem_1110;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int cnt = 1;
		int new_num=self(num);
		
		while(true) {	
			if(num==new_num) {
				break;
			}
			else {
				cnt++;
				new_num = self(new_num);	
				
			}
			
		}
		System.out.println(cnt);
	}
	public static int self(int num) {
		int new_num = num%10; //나머지
		int n = (num/10)+new_num;  //몫 + 나머지
		if(n >=10) {
			n = n%10;
			new_num= new_num*10+n;
		}
		else {
			new_num= new_num*10+n;
		}
		return new_num;
	}

}

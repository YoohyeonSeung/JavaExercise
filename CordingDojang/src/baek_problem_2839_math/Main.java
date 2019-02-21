package baek_problem_2839_math;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) {
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		
		int five_cnt = 0;
		int three_cnt = 0;
		if(num==0) {
			System.out.println(0);
		}		
		else if(num==1 ||num==2 || num==4) {
			System.out.println(-1);
		}
		else {
			five_cnt = num/5;
			int q = num%5;
			for(int n=five_cnt; n>=0;n--) {
				if(q%3==0) {
					three_cnt = q/3;
					break;
				}
				else {
					five_cnt-=1;
					q+=5;
				}
			}
			if(5*five_cnt + 3*three_cnt == num) {
				System.out.println(five_cnt+three_cnt);
			}
			else {
				System.out.println(-1);
			}
		}	
	}
}

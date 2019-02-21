package baek_problem_1978_math;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<num;i++) {
			arr[i] = scan.nextInt();
		}
		int prime_cnt = 0;
		
		for(int i=0; i<num; i++) {
			if(arr[i]==1) {
				continue;
			}
			else {
				for(int j = 2; j<= arr[i]; j++) {
					if(arr[i]%j==0) {
						if(j==arr[i]) {
							
							prime_cnt+=1;
						}
						break;
					}
				}	
			}
			
		}
		System.out.println(prime_cnt);
	}

}

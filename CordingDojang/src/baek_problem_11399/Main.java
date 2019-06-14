package baek_problem_11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		//사람 수 입력
		
		int n = scan.nextInt();
		
		int[] arr =  new int[n];
		
		for(int i = 0;  i< n ; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		
		Arrays.sort(arr);

		
		
		int sum = 0;    // 기다리는 시간들의 합
		int temp_sum = 0; // i번째 사람이 기다리는 시간
		
		
		for(int i = 0 ; i<n ; i++) {
			
			temp_sum += arr[i];
			sum+=temp_sum;
			System.out.println((i+1)+"번째 사람이 인출하는데 기다린 시간 : "+temp_sum);
		}	
		System.out.println(sum);
	}
}

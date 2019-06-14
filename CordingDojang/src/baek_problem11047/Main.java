package baek_problem11047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 동전의 종류 수
		
		int k = scan.nextInt();  // 가치의 합
		
		int[] arr = new int[n];
		
		for(int i = 0; i< n ;i++) {
			
			arr[i] = scan.nextInt();
			
		}
		
		int sum=0; //필요한 동전의 갯수
		
		for(int i =n-1 ; i>=0 ; i--) {
			
			if(k>=arr[i]) {
				sum += k/arr[i];
				k = k%arr[i];
			}
			
		
		
		}
		System.out.println(sum);
	}
	
}

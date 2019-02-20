package baek_problem03;

import java.util.Scanner;



public class solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] index = new int[n]; 
		for(int i=0; i<n;i++) {
			index[i] = scan.nextInt();
		}
		
		int max=0;
		for(int i=0; i<n;i++) {
			if(max < index[i]) {
				max = index[i];
			}
		}
		System.out.println(max);
		
		int[] Zero_arr = new int[max+1];
		int[] One_arr = new int[max+1];
		
		Zero_arr[0]=1;
		Zero_arr[1]=0;
		
		One_arr[0] = 0;
		One_arr[1] = 1;
		
		for(int i = 2; i<=max; i++) {
			Zero_arr[i] = Zero_arr[i-2]+Zero_arr[i-1];
			One_arr[i] = One_arr[i-2]+One_arr[i-1];
		}
		for(int i = 0; i < n; i++) {
			System.out.println(Zero_arr[index[i]]+" "+One_arr[index[i]]);
		}		
	}
}

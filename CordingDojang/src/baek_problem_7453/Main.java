package baek_problem_7453;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//입력 받을 배열의 행 갯수
		int num = scan.nextInt();
		
		int[] A = new int[num];
		int[] B = new int[num];
		int[] C = new int[num];
		int[] D = new int[num];
		
		
		for(int i=0; i<num;i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			C[i] = scan.nextInt();
			D[i] = scan.nextInt();
		}

		
		int[] First_Arr = new int[num*num];
		ArrayList<Integer> Second_Arr = new ArrayList<>();

		int index_cnt = 0;
		
		for(int i = 0; i<num ; i++) { //1열, 3열
			for(int j = 0; j<num;j++) { //2열, 4열 
				
				First_Arr[index_cnt] = A[i]+B[j];
				Second_Arr.add(C[i]+D[j]);
				
				index_cnt++;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i<First_Arr.length ; i++) {
		
			if( Second_Arr.contains( (-1) *  (First_Arr[i])     )) {
				cnt++;
			}
			
			
		}

		
		
		
		System.out.println(cnt);

	}

}

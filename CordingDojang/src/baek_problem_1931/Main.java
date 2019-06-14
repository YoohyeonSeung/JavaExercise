package baek_problem_1931;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//회의 갯수 입력
		int n = scan.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i<n ; i++) {					
			//회의 시작시간
			arr[i][0] = scan.nextInt();
			//회의 끝나는 시간
			arr[i][1] = scan.nextInt();
		}

		Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] arg0, int[] arg1) {
                if(arg0[1] == arg1[1]) {
                    return arg0[0] - arg1[0];
                } else {
                    return arg0[1] - arg1[1];
                }
            }
        }
		);    

		int end = -1;
		int cnt = 0;
		
		for(int i = 0; i<n  ; i++) {
			if( end <= arr[i][0] ) {     //끝나는 시간과 그다음 타임의 시작시간과 비교
				cnt++;        
				end = arr[i][1];
		
			}
		}
		System.out.println(cnt);
		
		
		
		
		
		
	}

}

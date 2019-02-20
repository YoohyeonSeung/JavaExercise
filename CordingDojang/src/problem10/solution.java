package problem10;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		int[] x_arr = new int [8];
		int[] y_arr = new int [8];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 사각형의 좌표를 입력해주세요(x1, y1 , x2, y2)");
		x_arr[0] = scan.nextInt();
		y_arr[0] = scan.nextInt();
		x_arr[1] = scan.nextInt();
		y_arr[1] = scan.nextInt();

		System.out.println("두번째 사각형의 좌표를 입력해주세요(x3, y3 , x4, y4)");
		x_arr[2] = scan.nextInt();
		y_arr[2] = scan.nextInt();
		x_arr[3] = scan.nextInt();
		y_arr[3] = scan.nextInt();
		
		System.out.println("세번째 사각형의 좌표를 입력해주세요(x5, y5 , x6, y6)");
		x_arr[4] = scan.nextInt();
		y_arr[4] = scan.nextInt();
		x_arr[5] = scan.nextInt();
		y_arr[5] = scan.nextInt();
		
		System.out.println("네번째 사각형의 좌표를 입력해주세요(x7, y7 , x8, y8)");
		x_arr[6] = scan.nextInt();
		y_arr[6] = scan.nextInt();
		x_arr[7] = scan.nextInt();
		y_arr[7] = scan.nextInt();
		
		// 배열 생성을 위한 x, y중 최대값 출력
		int x_max =x_arr[0];
		int y_max =y_arr[0];
		
		for(int i=1 ; i < x_arr.length; i++) {
			if(x_max < x_arr[i]) {
				x_max = x_arr[i];
			}
		}
		for(int i=1 ; i < y_arr.length; i++) {
			if(y_max < y_arr[i]) {
				y_max = y_arr[i];
			}
		}

		int[][] matrix = new int[x_max][y_max];
		for(int i=0; i < y_max; i++) {
			for(int j=0; j < x_max; j++) {
				matrix[j][i]=0;
			}
		}
		// 첫번째 사각형을 배열의 값을 1로 치환
		for(int i= x_arr[0] ; i< x_arr[1]; i++  ) { //x축
			for(int j= y_arr[0] ; j < y_arr[1]  ; j++ ) { //y축
				matrix[i][j] = 1;
			}
		}
		// 두번째 사각형을 배열의 값을 1로 치환
		for(int i= x_arr[2] ; i< x_arr[3]; i++  ) { //x축
			for(int j= y_arr[2] ; j < y_arr[3]  ; j++ ) { //y축
				matrix[i][j] = 1;
			}
		}
		// 세번째 사각형을 배열의 값을 1로 치환
		for(int i= x_arr[4] ; i< x_arr[5]; i++  ) { //x축
			for(int j= y_arr[4] ; j < y_arr[5]  ; j++ ) { //y축
				matrix[i][j] = 1;
			}
		}
		// 네번째 사각형을 배열의 값을 1로 치환
		for(int i= x_arr[6] ; i< x_arr[7]; i++  ) { //x축
			for(int j= y_arr[6] ; j < y_arr[7]  ; j++ ) { //y축
				matrix[i][j] = 1;
			}
		}	

		int area = 0;
		
		for(int j=0; j < y_max; j++) {
			for(int i=0; i < x_max; i++) {
				if(matrix[i][j]==1) {
					area+=matrix[i][j];
				}
				
			}

		}
		System.out.println("넓이는 "+area+" 입니다.");	
	}

}

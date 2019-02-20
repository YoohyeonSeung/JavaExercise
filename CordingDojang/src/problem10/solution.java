package problem10;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		int[] x_arr = new int [8];
		int[] y_arr = new int [8];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° �簢���� ��ǥ�� �Է����ּ���(x1, y1 , x2, y2)");
		x_arr[0] = scan.nextInt();
		y_arr[0] = scan.nextInt();
		x_arr[1] = scan.nextInt();
		y_arr[1] = scan.nextInt();

		System.out.println("�ι�° �簢���� ��ǥ�� �Է����ּ���(x3, y3 , x4, y4)");
		x_arr[2] = scan.nextInt();
		y_arr[2] = scan.nextInt();
		x_arr[3] = scan.nextInt();
		y_arr[3] = scan.nextInt();
		
		System.out.println("����° �簢���� ��ǥ�� �Է����ּ���(x5, y5 , x6, y6)");
		x_arr[4] = scan.nextInt();
		y_arr[4] = scan.nextInt();
		x_arr[5] = scan.nextInt();
		y_arr[5] = scan.nextInt();
		
		System.out.println("�׹�° �簢���� ��ǥ�� �Է����ּ���(x7, y7 , x8, y8)");
		x_arr[6] = scan.nextInt();
		y_arr[6] = scan.nextInt();
		x_arr[7] = scan.nextInt();
		y_arr[7] = scan.nextInt();
		
		// �迭 ������ ���� x, y�� �ִ밪 ���
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
		// ù��° �簢���� �迭�� ���� 1�� ġȯ
		for(int i= x_arr[0] ; i< x_arr[1]; i++  ) { //x��
			for(int j= y_arr[0] ; j < y_arr[1]  ; j++ ) { //y��
				matrix[i][j] = 1;
			}
		}
		// �ι�° �簢���� �迭�� ���� 1�� ġȯ
		for(int i= x_arr[2] ; i< x_arr[3]; i++  ) { //x��
			for(int j= y_arr[2] ; j < y_arr[3]  ; j++ ) { //y��
				matrix[i][j] = 1;
			}
		}
		// ����° �簢���� �迭�� ���� 1�� ġȯ
		for(int i= x_arr[4] ; i< x_arr[5]; i++  ) { //x��
			for(int j= y_arr[4] ; j < y_arr[5]  ; j++ ) { //y��
				matrix[i][j] = 1;
			}
		}
		// �׹�° �簢���� �迭�� ���� 1�� ġȯ
		for(int i= x_arr[6] ; i< x_arr[7]; i++  ) { //x��
			for(int j= y_arr[6] ; j < y_arr[7]  ; j++ ) { //y��
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
		System.out.println("���̴� "+area+" �Դϴ�.");	
	}

}

package baek_problem_1002;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Point[] Ptarr = new Point[num];
		for(int i=0; i<num ; i++) {	
			int x1  = scan.nextInt();
			int y1  = scan.nextInt();
			int r1  = scan.nextInt();
			int x2  = scan.nextInt();
			int y2  = scan.nextInt();
			int r2  = scan.nextInt();
			Ptarr[i] = new Point(x1, y1, r1, x2, y2, r2);
		}
		
		for(int i=0; i<num; i++) {
			double grad = (double) (Ptarr[i].y2-Ptarr[i].y1)/(Ptarr[i].y2-Ptarr[i].y1);           //����
			int count = 0;
			
			if(Ptarr[i].x1==Ptarr[i].x2 && Ptarr[i].y1==Ptarr[i].y2) { //���� ���� ������
				if(Ptarr[i].r1==   Ptarr[i].r2) { //�������� ���� ��, 
					int r = Ptarr[i].r1;					
					//üũ�� ��ǥ �������� ����	
					int start_x = Ptarr[i].x1 - Ptarr[i].r1;
					int end_x = Ptarr[i].x1 + Ptarr[i].r1;
					int start_y = Ptarr[i].y1 - Ptarr[i].r1;
					int end_y = Ptarr[i].y1 + Ptarr[i].r1;
					
					for(int x = start_x ; x <= end_x ; x++) { //x������ ����

						for(int y= start_y; y <= end_y ; y++) { //y�� ����
							
							if(inCircle(Ptarr[i].x1, Ptarr[i].y1, x, y, r)) {
								count++;
							}
						}
					}
					System.out.println((count-1));
				}
				else { //�������� �ٸ���  
					System.out.println(count);
				}
				//���������� ���� �� �ϼ�!
			}
			
			else { //���� ������ �ٸ���		�ﰢ���׷��� �а� ���� �����϶� ������ �ϱ�
				
				if(Ptarr[i].Dist()>Ptarr[i].r1+Ptarr[i].r2) { //�������� �Ȱ�ĥ ��				
					continue;
				}
				else { //�������� �����̻� ��ĥ ��
					System.out.println("�Ƹ���");
					
					
					
					
				}
				
			}
			
		}		
	}
	
	public static boolean inCircle(int x1, int y1, int x2, int y2, int r) {	
		if (Math.sqrt( Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2) ) <= r) {
			return true;
		}
		else {
			return false;
		}
		

	}	
}
	
	
class Point{
	int x1,  y1, r1, x2, y2, r2;
	Point(int x1, int y1, int r1, int x2, int y2, int r2 ){		
		this.x1 = x1;
		this.y1 = y1;
		this.r1 = r1;
		this.x2 = x2;
		this.y2 = y2;
		this.r2 = r2;		
	}
	public double Dist() {
		double result= Math.sqrt(  Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)   );                      
		return result;
	}
	
	
	
	
}

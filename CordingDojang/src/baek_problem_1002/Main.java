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
			double grad = (double) (Ptarr[i].y2-Ptarr[i].y1)/(Ptarr[i].y2-Ptarr[i].y1);           //기울기
			int count = 0;
			
			if(Ptarr[i].x1==Ptarr[i].x2 && Ptarr[i].y1==Ptarr[i].y2) { //관측 지점 같을때
				if(Ptarr[i].r1==   Ptarr[i].r2) { //반지름이 같을 때, 
					int r = Ptarr[i].r1;					
					//체크할 좌표 시작점과 끝점	
					int start_x = Ptarr[i].x1 - Ptarr[i].r1;
					int end_x = Ptarr[i].x1 + Ptarr[i].r1;
					int start_y = Ptarr[i].y1 - Ptarr[i].r1;
					int end_y = Ptarr[i].y1 + Ptarr[i].r1;
					
					for(int x = start_x ; x <= end_x ; x++) { //x축으로 시작

						for(int y= start_y; y <= end_y ; y++) { //y축 시작
							
							if(inCircle(Ptarr[i].x1, Ptarr[i].y1, x, y, r)) {
								count++;
							}
						}
					}
					System.out.println((count-1));
				}
				else { //반지금이 다를때  
					System.out.println(count);
				}
				//관측지점이 같을 때 완성!
			}
			
			else { //관측 지점이 다를때		삼각형그려서 둔각 예각 직각일때 나눠서 하기
				
				if(Ptarr[i].Dist()>Ptarr[i].r1+Ptarr[i].r2) { //반지름이 안겹칠 때				
					continue;
				}
				else { //반지름이 한점이상 겹칠 때
					System.out.println("아몰랑");
					
					
					
					
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

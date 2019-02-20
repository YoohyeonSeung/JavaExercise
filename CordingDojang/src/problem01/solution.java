package problem01;


public class solution {
	public static int self_number(int n) {
		int d=n;
		
		while(n>0) {
			d+=n%10;
			n=(n-(n%10))/10;		
		}
		return d;	
	}

	/* 코드 구현방법
	 * 배열 arr에 1~5000까지 제너레이터를 다 모은 다음,
	 * 첫 for구문에서 i=1이 배열과 모두 다 비교해서 i가
	 * arr에 없다면 sum에 더하고(40번째 if문) 만약 잇다면 그냥 지나가는 
	 * 방법으로 셀프 넘버를 하나씩 다 구하였다. 
	 */

	public static void main(String[] args) {
		int sum=0;
		int[] arr = new int[5000];
		for(int i=0; i<5000; i++ ) {  
			arr[i]=self_number(i+1);
		}

		for(int i=1; i<=5000; i++) {
			int count=0;
			while(count<=4999) {
				if(self_number(count)!=i) {
					count++;
				}
				else {
					break;
				}
			}
			if(count>4999) {
				System.out.println(i);
				sum += i;
			}
			
		}
		System.out.println(sum);
	}

}

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

	/* �ڵ� �������
	 * �迭 arr�� 1~5000���� ���ʷ����͸� �� ���� ����,
	 * ù for�������� i=1�� �迭�� ��� �� ���ؼ� i��
	 * arr�� ���ٸ� sum�� ���ϰ�(40��° if��) ���� �մٸ� �׳� �������� 
	 * ������� ���� �ѹ��� �ϳ��� �� ���Ͽ���. 
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

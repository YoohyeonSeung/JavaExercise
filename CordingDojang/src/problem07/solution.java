package problem07;

public class solution {
	public static int Eight_counting(int n) {
		int count=0;
		while(n>0) {
			if(n%10==8) {
				count+=1;
				n=(n-(n%10))/10;				
			}
			else {
				n=(n-(n%10))/10;
			}			
		}
		return count;
		
		
		
	}

	public static void main(String[] args) {
		/*
		 * 1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?

		   8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
		   (�� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
		 */
		int count=0;
		for(int i=1; i<=10000;i++) {
			count+=Eight_counting(i);
		}
		System.out.println("1~10,000���� ���� 8�� �� "+count+"�� ���Խ��ϴ�.");
		
		
		
		
		
		
	}
}
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
		 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

		   8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
		   (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
		 */
		int count=0;
		for(int i=1; i<=10000;i++) {
			count+=Eight_counting(i);
		}
		System.out.println("1~10,000까지 숫자 8은 총 "+count+"번 나왔습니다.");
		
		
		
		
		
		
	}
}

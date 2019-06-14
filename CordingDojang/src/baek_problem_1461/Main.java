package baek_problem_1461;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//숫자 입력
		int n = scan.nextInt();
		
		int[] dp = new int[n+1];    //1부터 n까지 최소로 연산해야되는 횟수를 배열로 저장하려고 하기 때문
		
		
		dp[1] = 0;  // 0과 1은 계산 할 이유가 없다. 
		
		for(int i = 2 ; i<=n ; i++) {
			dp[i]= dp[i-1]+1;     // 2와 3으로 나누어지지 않는 경우 앞의 수에서 1을 더하면된다. 
			                           // 이 코드로 인해 2와 3으로 나누어지지는지에 대한 연산이 필요없다.
			
			if(i%2 ==0 ) {
				if(dp[i]  >  (dp[i/2]+1)   )
					dp[i] = dp[i/2]+1;
			}
			if(i%3==0) {
				if(dp[i]  >  (dp[i/3]+1)   )
					dp[i] = dp[i/3]+1;
			}		
		}
		System.out.println(dp[n]);
		
		
		
		
	
	}
}

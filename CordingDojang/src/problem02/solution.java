package problem02;

import java.util.Scanner;

public class solution {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("숫자를 입력해주세요.");
      
      int n=scan.nextInt();
      int num=n*n;
      

      //배열 생성 완료
      int[][] matrix = new int[n][n];

      
      int l=0;
      
      int count = n*2-1;

      
      int v=0; //행 시행 횟수
      int a = 0; // 행
      int v_s = 0; //행당 시작점(열)
      int v_e = (n-1); //행당 끝점(열) 
      
      int h=0; //열 시행 횟수
      int b = n-1; // 열
      int h_s = 1; //열당 시작점(행)
      int h_e = (n-1); //열당 끝점(행) 

      
      
      for(int j=0; j<count; j++) {     //j가 2로 나누어지면 행, 나머지가 1이 나오면 열
         
                  
         if(j%2==0) {    // 행 먼저
            if(v%2==0) { //위쪽(오른쪽으로 진행)

               for(int k=v_s; k <= v_e ; k++ ) {
                  
                  matrix[a][k]=l;
                  l++;
               }

               //다음 연산을 위한 준비(행)
               a+=((n-1)-v)*Math.pow(-1, v); //행변경               
               v_s+=((n-2)-v)*Math.pow(-1, v);   //시작점 변경
               v_e+=((n-1)-v)*Math.pow(-1, v+1);  //끝점 변경
               v+=1;      //행 횟수 증가

               
            }
            else if(v%2!=0) {  // 아래쪽(왼쪽으로 진행)

               for(int k=v_s   ; k >= v_e; k-- ) {
                  
                  matrix[a][k]=l;
                  l+=1;
                  
               }
               //다음 연산을 위한 준비(열)
               a+=((n-1)-v)*Math.pow(-1, v); //행변경            
               v_s+=((n-2)-v)*Math.pow(-1, v);   //시작점 변경
               v_e+=((n-1)-v)*Math.pow(-1, v+1);  //끝점 변경
               v+=1;      //행 횟수 증가

               
            }
            
         }
         else{   // 열
            if(h%2==0) { //오른쪽

               for(int k=h_s; k <= h_e ; k++) {
                  
                  matrix[k][b]=l;
               
                  l+=1;
               }
               //다음 열 연산을 위한 준비(행)
               b+=((n-1)-h)*Math.pow(-1, h+1);  //열 변경
               h_s+=(n-3-h)*Math.pow(-1, h);   //시작점 변경
               h_e+=((n-2)-h)*Math.pow(-1, h+1); // 끝점 변경
               h+=1;   //열 횟수 증가

            }
            else if(h%2!=0) {  //왼쪽

               for(int k=h_s ; k>=h_e ; k--) {
                  
                  
                  matrix[k][b]=l;
                  
                  l+=1;
               }
               //다음 열 연산을 위한 준비(행)
               b+=((n-1)-h)*Math.pow(-1, h+1);  //열 변경
               h_s+=(n-3-h)*Math.pow(-1, h);   //시작점 변경
               h_e+=((n-2)-h)*Math.pow(-1, h+1); // 끝점 변경
               h+=1;   //열 횟수 증가   

            }
            
         }
      }
      for(int i=0; i<n ;i++) {
         for(int j=0; j<n; j++) {
            System.out.print(matrix[i][j]+" ");
         }
         System.out.println(" ");
      }
   }
}
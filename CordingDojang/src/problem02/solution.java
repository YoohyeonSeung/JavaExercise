package problem02;

import java.util.Scanner;

public class solution {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("���ڸ� �Է����ּ���.");
      
      int n=scan.nextInt();
      int num=n*n;
      

      //�迭 ���� �Ϸ�
      int[][] matrix = new int[n][n];

      
      int l=0;
      
      int count = n*2-1;

      
      int v=0; //�� ���� Ƚ��
      int a = 0; // ��
      int v_s = 0; //��� ������(��)
      int v_e = (n-1); //��� ����(��) 
      
      int h=0; //�� ���� Ƚ��
      int b = n-1; // ��
      int h_s = 1; //���� ������(��)
      int h_e = (n-1); //���� ����(��) 

      
      
      for(int j=0; j<count; j++) {     //j�� 2�� ���������� ��, �������� 1�� ������ ��
         
                  
         if(j%2==0) {    // �� ����
            if(v%2==0) { //����(���������� ����)

               for(int k=v_s; k <= v_e ; k++ ) {
                  
                  matrix[a][k]=l;
                  l++;
               }

               //���� ������ ���� �غ�(��)
               a+=((n-1)-v)*Math.pow(-1, v); //�ຯ��               
               v_s+=((n-2)-v)*Math.pow(-1, v);   //������ ����
               v_e+=((n-1)-v)*Math.pow(-1, v+1);  //���� ����
               v+=1;      //�� Ƚ�� ����

               
            }
            else if(v%2!=0) {  // �Ʒ���(�������� ����)

               for(int k=v_s   ; k >= v_e; k-- ) {
                  
                  matrix[a][k]=l;
                  l+=1;
                  
               }
               //���� ������ ���� �غ�(��)
               a+=((n-1)-v)*Math.pow(-1, v); //�ຯ��            
               v_s+=((n-2)-v)*Math.pow(-1, v);   //������ ����
               v_e+=((n-1)-v)*Math.pow(-1, v+1);  //���� ����
               v+=1;      //�� Ƚ�� ����

               
            }
            
         }
         else{   // ��
            if(h%2==0) { //������

               for(int k=h_s; k <= h_e ; k++) {
                  
                  matrix[k][b]=l;
               
                  l+=1;
               }
               //���� �� ������ ���� �غ�(��)
               b+=((n-1)-h)*Math.pow(-1, h+1);  //�� ����
               h_s+=(n-3-h)*Math.pow(-1, h);   //������ ����
               h_e+=((n-2)-h)*Math.pow(-1, h+1); // ���� ����
               h+=1;   //�� Ƚ�� ����

            }
            else if(h%2!=0) {  //����

               for(int k=h_s ; k>=h_e ; k--) {
                  
                  
                  matrix[k][b]=l;
                  
                  l+=1;
               }
               //���� �� ������ ���� �غ�(��)
               b+=((n-1)-h)*Math.pow(-1, h+1);  //�� ����
               h_s+=(n-3-h)*Math.pow(-1, h);   //������ ����
               h_e+=((n-2)-h)*Math.pow(-1, h+1); // ���� ����
               h+=1;   //�� Ƚ�� ����   

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
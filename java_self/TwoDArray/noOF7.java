package TwoDArray;
import java .util.*;
class noOF7 
{
     public static void searchMatrix(int[][] matrix) 
        {
          if(matrix.length==0)
            System.out.println("Return false");
          int c=0;
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 7){
                   c++;
                }
            }
        }
          System.out.println("No of 7s " +c);
        }
     public static void main (String args[])
     {
         int m, n, i, j;   
         Scanner sc=new Scanner(System.in);   
         System.out.print("Enter the number of rows: ");   
           m = sc.nextInt();   
         System.out.print("Enter the number of columns: ");   
           n = sc.nextInt();   
          int matrix[][] = new int[m][n];   
         System.out.println("Enter the elements of the array: ");   
         for (i = 0; i < m; i++) {  
            for (j = 0; j < n; j++) {
              matrix[i][j] = sc.nextInt();
             } 
        }  

         searchMatrix(matrix) ;

         System.out.println("Elements of the array are: ");   
         for (i = 0; i < m; i++) {   
           for (j = 0; j < n; j++)  {
              System.out.print(matrix[i][j] + " ");   
           }
          System.out.println(); 
        }
    }
}

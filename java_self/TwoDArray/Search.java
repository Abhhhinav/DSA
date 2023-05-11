package TwoDArray;
import java .util.*;
class Search 
{
     public static boolean searchMatrix(int[][] matrix, int target) 
        {
          if(matrix.length==0)
          return false;
          int n = matrix.length;
          int m = matrix[0].length;
          int low = 0;
          int high = (n*m)-1;
            while(low<=high) {
              int mid = (low + (high - low )/2);
              if(matrix[mid/m][mid%m] == target){
                  return true;
               }
              if(matrix[mid/m][mid%m]<target){
                  low = mid+1;
               }
              else{
                  high = mid -1;
                }
            }
         return false;
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
         System.out.println("Elements of the array are: ");   
         for (i = 0; i < m; i++) {   
           for (j = 0; j < n; j++)  {
              System.out.print(matrix[i][j] + " ");   
           }
          System.out.println(); 
        }
      

    }
}

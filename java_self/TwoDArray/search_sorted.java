package TwoDArray;
public class search_sorted {
        public static boolean searchMatrix(int[][] matrix, int target) {
            int row = 0,col = matrix[0].length-1;
            while(row<matrix.length && col>=0){
                if((matrix[row][col]) == target){
                    System.out.println("FOund");
                    return true;
                }
                else if(target<matrix[row][col]){
                    col--;
                }
                else{
                    row++;
                }
            }
            System.out.println("Key not found");
            return false;
        }
        public static void main(String args[]){
            int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
            int target = 166;
            searchMatrix(matrix,target);
        }
    }


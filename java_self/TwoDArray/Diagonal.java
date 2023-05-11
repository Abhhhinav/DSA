package TwoDArray;
public class Diagonal {
        public static int diagonalSum(int[][] mat) {
            int i=0,sum=0;
            for(i=0;i<mat.length;i++){
                sum+=mat[i][i];
                if(i!=mat.length-1-i){
                sum+=mat[i][mat.length-1-i];}
            }
            return sum;
        }
        public static void main(String args[]){
            int mat[][]={{1,1,1,1},
                         {1,1,1,1},
                         {1,1,1,1},
                         {1,1,1,1}};
            System.out.println(diagonalSum(mat));
        }
}


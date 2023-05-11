package TwoDArray;
public class Transpose {
    public static void printM(int mat[][]){
       System.out.println("the Matrix is ");
       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
       }
    }
    public static void main(String args[]){
        int row = 3,col = 3;
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};

        printM(mat);

        int Transpose[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0 ;j<col;j++){
                Transpose[j][i] = mat[i][j];
            }
        }
        printM(Transpose);
    }
}

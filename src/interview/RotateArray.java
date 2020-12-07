package interview;

public class RotateArray {

    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int m = matrix.length;
        rotateMatrix(matrix,m);

        for(int i=0;i<m; i++){
            for (int j=0; j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotateMatrix(int[][] matrix, int size){
        System.out.println("length: "+size);

        for(int i=0; i<size; i++){
            for(int j=0; j<i; j++){
                if(i==j)
                    break;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int k =0; k<size; k++){
            for(int m=0; m<size/2; m++){
                System.out.println("k: "+k);
                System.out.println("m: "+m);
                int temp = matrix[k][m];
                matrix[k][m] = matrix[k][size-m-1];
                matrix[k][size-m-1] = temp;
            }
        }
    }
}

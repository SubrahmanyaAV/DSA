package array;

public class TransposeMatrix {

    //for a given square 2D matrix return the transpose of the 2D matrix
    //transpose --> converting rows into columns ==> ((i,j) -> (j,i)) i.e swapping

    public static void transpose(int[][] arr){
        
        //lower triangle of the matrix ==> swap
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int swap = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = swap;
            }   
        }
        
        //print the matrix
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        int[][] arr= {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};

        transpose(arr);              
        
    }
}

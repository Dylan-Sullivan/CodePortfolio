/* The class Solution2 has a method called spiralOrder
   that recieves a two dimensional matrix and constructs
   a list that contains the elements of the matrix in spiraled
   order starting from the first element
 */


import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<Integer> spiralOrder(int[][] matrix){
        int matrixSize = matrix.length * matrix[0].length;
        int rowSize = matrix.length - 1; // why -1, indexing to access matrix values
        int colSize = matrix[0].length - 1; // why -1, indexing to access matrix values
        int counter = 0; // counts elements being added to list
        int i = 0; // row index
        int j = 0; // col index
        int var = 0; // variable bounding right and left movements
        int rB = 0; // boundary on rows only
        int cB = 0; // boundary on cols only
        List<Integer> spiralList = new ArrayList<>(); // Array List to hold spiraling matrix

        /*
        * The reason for the if statements that continuously check whether the counter is equivalent
        * to the matrix size is because there is a bug that when the matrix is non-square and
        * both its row and column lengths are odd the restraints (var, cB, rB) do not function
        * properly and allow duplicate elements to be added
        *
        * will keep working on this to try to understand that reason for the bug!
        * */

        while(counter < matrixSize){

            // Code that only adds top left element
            if(counter == 0){
                spiralList.add(matrix[i][j]);
                counter++;
            }

            // Right movement
            while(i == rowSize - (rowSize - rB) && j < (colSize - var)){
                j++;
                spiralList.add(matrix[i][j]);
                counter++;
            }

            if(counter == matrixSize){
                continue;
            }

            // Down movement
            while(i < (rowSize - var) && j == colSize - var){
                //System.out.println("Down movement");
                i++;
                spiralList.add(matrix[i][j]);
                counter++;
            }

            if(counter == matrixSize){
                continue;
            }

            // Left movement
            while(i == (rowSize - var) && j > (colSize - (colSize - var))){
                j--;
                spiralList.add(matrix[i][j]);
                counter++;
            }

            var++;
            rB++;

            if(counter == matrixSize){
                continue;
            }

            // Up movement
            while(i > (rowSize - (rowSize - rB)) && j == (colSize - (colSize - cB))){
                i--;
                spiralList.add(matrix[i][j]);
                counter++;
            }

            cB++;

            if(counter == matrixSize){
                continue;
            }
        }

        return spiralList;
    }

    // Driver program that creates six different matrices of unique dimension and then passes to spiralOrder
    public static void main(String [] args){
        Solution2 sol2 = new Solution2();
        int [][] matrix1;
        int [][] matrix2;
        int [][] matrix3;
        int [][] matrix4;
        int [][] matrix5;
        int [][] matrix6;
        int rows1 = 5;
        int cols1 = 5;
        int rows2 = 4;
        int cols2 = 3;
        int rows3 = 7;
        int cols3 = 5;
        int rows4 = 6;
        int cols4 = 6;
        int rows5 = 4;
        int cols5 = 6;
        int rows6 = 5;
        int cols6 = 7;
        matrix1 = new int[rows1][cols1];
        matrix2 = new int[rows2][cols2];
        matrix3 = new int[rows3][cols3];
        matrix4 = new int[rows4][cols4];
        matrix5 = new int[rows5][cols5];
        matrix6 = new int[rows6][cols6];
        List<Integer> solution = new ArrayList<>();

        for(int i = 0; i < rows1; i++){
            for(int j = 0; j < cols1; j++){
                matrix1[i][j] = i * j;
            }
        }

        for(int i = 0; i < rows1; i++){
            for(int j = 0; j < cols1; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < rows2; i++){
            for(int j = 0; j < cols2; j++){
                matrix2[i][j] = i * j;
            }
        }

        for(int i = 0; i < rows2; i++){
            for(int j = 0; j < cols2; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < rows3; i++){
            for(int j = 0; j < cols3; j++){
                matrix3[i][j] = i * j;
            }
        }

        for(int i = 0; i < rows3; i++){
            for(int j = 0; j < cols3; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < rows4; i++){
            for(int j = 0; j < cols4; j++){
                matrix4[i][j] = i * j;
            }
        }

        for(int i = 0; i < rows4; i++){
            for(int j = 0; j < cols4; j++){
                System.out.print(matrix4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < rows5; i++){
            for(int j = 0; j < cols5; j++){
                matrix5[i][j] = i * j;
            }
        }

        for(int i = 0; i < rows5; i++){
            for(int j = 0; j < cols5; j++){
                System.out.print(matrix5[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < rows6; i++){
            for(int j = 0; j < cols6; j++){
                matrix6[i][j] = i * j;
            }
        }

        for(int i = 0; i < rows6; i++){
            for(int j = 0; j < cols6; j++){
                System.out.print(matrix6[i][j] + " ");
            }
            System.out.println();
        }

        solution = sol2.spiralOrder(matrix1);

        for(int i = 0; i < solution.size(); i++){
            System.out.print(solution.get(i) + ", ");
        }

        System.out.println();

        solution = sol2.spiralOrder(matrix2);

        for(int i = 0; i < solution.size(); i++){
            System.out.print(solution.get(i) + ", ");
        }

        System.out.println();

        solution = sol2.spiralOrder(matrix3);

        for(int i = 0; i < solution.size(); i++){
            System.out.print(solution.get(i) + ", ");
        }

        System.out.println();

        solution = sol2.spiralOrder(matrix4);

        for(int i = 0; i < solution.size(); i++){
            System.out.print(solution.get(i) + ", ");
        }

        System.out.println();

        solution = sol2.spiralOrder(matrix5);

        for(int i = 0; i < solution.size(); i++){
            System.out.print(solution.get(i) + ", ");
        }

        System.out.println();

        solution = sol2.spiralOrder(matrix6);

        for(int i = 0; i < solution.size(); i++){
            System.out.print(solution.get(i) + ", ");
        }

        System.out.println();
    }
}

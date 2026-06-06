public class Array_part2 {
    public static void main(String[] args) {
        System.out.println("matrix is Added");
        
       int[][]Matrix = {{1,2,3},
                        {4,5,6}
                    };
       

       int[][] matrix2 = {{7,8,9},
                          {10,11,12}
                    };    
                    
  int row = Matrix.length;
  int col = Matrix[0].length;
  
  int [][] result = new int[row][col];

  for(int i = 0;i<row;i++){
    for(int j = 0;j<col; j++){
        result[i][j] = Matrix[i][j] + matrix2[i][j];
    }
  }

  // print result 

  System.out.println("result printed");
  for(int i = 0;i<row;i++){
    for(int j = 0 ;j<col;j++){
        System.out.println(result[i][j] + " ");
    }
    System.out.println();
  }

    }
}

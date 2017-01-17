  /*
  Take any NxN matrix as input, and rotate it 90 degrees. Left or Right
  eg. 123  Rotate Right  741
      456                852
      789                963
      
  Linear Algebra helps us do this easily. 
  For LEFTROTATE we take the transpose, and swap rows
  For RIGHTROTATE we swap rows and then take transpose
  */ 
  
  /*
                      CONVINCE YOURSELF THIS WORKS:
  123   AFTER TRANSPOSE:   147  AFTER SWAPPING(Reversing all rows):   741
  456                      258                                        852
  789                      369                                        963
  
  */


  public static void rotateLeft90Degrees(int A[][]){
      transpose(A);
      swapRows(A);
    }
    
    public static void rotateRight90Degrees(int A[][]){
      swapRows(A);
      transpose(A);
    }
    
    
    public static void transpose(int A[][]){
      for(int i = 0; i < A.length; i++){
        for(int j = i; j < A[i].length; j++){
          int temp = A[i][j];
          A[i][j] = A[j][i];
          A[j][i] = temp;
        }
      }
    }
    
    public static void swapRows(int A[][]){
      for(int i = 0; i < A.length; i++){
        for(int j = i; j < A[i].length; j++){
          int temp[] = A[i];
          A[i] = A[j];
          A[j] = temp;
        }
      }
    }

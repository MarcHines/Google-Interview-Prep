/*
123
456    => {123698745}
789

There is not really a "trick" to this, besides recongnizing the pattern of how we are printing/ or listing the 
elements in the matrix. Go right, down, left, then up, but we must not print any element more than once. So we 
must increment or decrement accordingly.
*/

public static ArrayList<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;
        
        int left = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        while(left <= right && top <= bottom) {
            //For loops in order : Go right, Go Down, Go left, Go Up
            for(int i = left; i <= right; i++) 
              result.add(matrix[top][i]);
            top++;
           
            for(int i = top; i <= bottom; i++) 
              result.add(matrix[i][right]);
            right--;
          
            for(int i = right; i >= left; i--) 
              result.add(matrix[bottom][i]);
            bottom--;
         
            for(int i = bottom; i >= top; i--) 
              result.add(matrix[i][left]);
            left++;
        }
        return result;
    }

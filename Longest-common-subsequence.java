


public class lcs {
    public static int find(char[] A, char[] B) {
        //Create a 2 2D Array with the sizes or rows being length of A + 1, and cols being length of B + 2
	
        int[][] LCS = new int[A.length + 1][B.length + 1];  //One for the count
	      String[][] solution = new String[A.length + 1][B.length + 1];  //One for the result string

	//Populate the first row and first column of arrays with 0. Java handles this for int arrays automatically since always initialized to 0
	 for (int i = 0; i <= B.length; i++) {
	    // LCS[0][i] = 0;
	    solution[0][i] = "0";
	 }
	    for (int i = 0; i <= A.length; i++) {
	//LCS[i][0] = 0;
	    solution[i][0] = "0";
	}
	//We nest two for loops since we have 2D arrays. Starting both at 1 and ending at length of first string, then length of 2nd string
	for (int i = 1; i <= A.length; i++) {
	    for (int j = 1; j <= B.length; j++) { //There are TWO cases : 1 both indexs are equal, or 2. they are not equal
	     //FIRST CASE: We set the LCS[i][j] Equal to 1 minus its indexes, and then add 1 to the total. Set the marker in solution array[i]j]to Diagnoal
		if (A[i - 1] == B[j - 1]) {
		      LCS[i][j] = LCS[i - 1][j - 1] + 1;
		    solution[i][j] = "diagonal";
		} else {
	     //SECOND CASE: Find the max between one minus each index of the LCS array.We do this one at a time, ie subtract one from i index,check. Then subtract one from the second index and check MAX of two results.  
		    LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
		    if (LCS[i][j] == LCS[i - 1][j]) {
                        //Mark solution as "top" if i-1 index was largest
			solution[i][j] = "top";
		    } else {
     //Mark solution as "left" if j-1 was largest
			solution[i][j] = "left";
		    }
		}
	    }
	}
  
  
  
  
	// below code is to just print the result
	String x = solution[A.length][B.length];
	String answer = "";
	int a = A.length;
	int b = B.length;
	while (x != "0") {
	    if (solution[a][b] == "diagonal") {
		answer = A[a - 1] + answer;
		a--;
		b--;
	    } else if (solution[a][b] == "left") {
		b--;
	    } else if (solution[a][b] == "top") {
		a--;
	    }
	    x = solution[a][b];
	}
	System.out.println(answer);
	
	for (int i = 0; i <= A.length; i++) {
	    for (int j = 0; j <= B.length; j++) {
		System.out.print(" " + LCS[i][j]);
	    }
	    System.out.println();
	}
	return LCS[A.length][B.length];
    }

    public static void main(String[] args) {
	String A = "AGGTAB";
	String B = "GXTXAYB";
	System.out.println("LCS :" + find(A.toCharArray(), B.toCharArray()));
    }
}

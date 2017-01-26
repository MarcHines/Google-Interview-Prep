/*
Merge to sorted arrays A and B, with the number of initalized elementes of A and B given as input. A will have enough space for B  
  1.insert from the m+n-1 position at the bigger array
  2.keep 3 pointers: one at the insertion point
  3.one at the end of nums1; one at the end of nums2  
*/




 public static void mergeSortedArrays(int A[], int B[], int aNumOfElements, int bNumOfElements){   
    int i= aNumOfElements-1;
    int j=bNumOfElements-1;
    int k = aNumOfElements + bNumOfElements - 1;
    
    while (i>-1 && j>-1) 
      A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
    
    while (j>-1)
      A[k--]=B[j--];
 
    }

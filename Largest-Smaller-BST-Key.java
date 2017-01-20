/*
Given a root of a binary search tree and a key x, find the largest key in the tree that is smaller than x.

Example: if an in-order list of all keys in the tree is 
{2, 3, 4, 7, 17, 19, 21, 35, 89} and x is 19,
the biggest key that is smaller than x is 17.
*/


public static int findLargestSmallerThan(Node root, int k){
       int result = Integer.MIN_VALUE;
       while(root != null){
         if(root.value < k){
           result = root.value;
           root = root.rightChild;
         }else{
           root = root.leftChild;
         }
       }
       return result;
   }
    
/*WE CAN ALSO DO THIS RECURSIVELY */

public static int findLargestSmallerKeyR(Node root, int key, int result){
     if(root == null) return result;
     if(root.value < key){
       result = root.value;
       return findLargestSmallerKeyR(root.rightChild, key, result);
     }
      return  findLargestSmallerKeyR(root.leftChild, key, result);
   }
    

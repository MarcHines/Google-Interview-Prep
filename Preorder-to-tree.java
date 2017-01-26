/*
o the idea is Pass the min­i­mum and max­i­mum val­ues between which the node’s value must lie.

    Exam­ple: int[] pre­Order = { 20, 10, 5, 1, 7, 15, 30, 25, 35, 32, 40 };
    First ele­ment in the pre­order[] will def­i­nitely be the root, which is 20 here.
    we start with the range min­i­mum = Integer.MIN_VALUE and max­i­mum = Interger.MAX_VALUE, so your root can take any value between this range.
    So when putting the left node of 20(root), it must lie within the range to min­i­mum = Integer.MIN_VALUE and max­i­mum = 20, 
    so check the next ele­ment in the pre­order[],
    if it lies in this range, make it the left child to the root, 
    else it must the the right chlid of the root and so on. See the fig­ure for 
    bet­ter under­stand­ing. ( see the execu­tion sequence)
    Solve it recursively.



*/
public Node constructTree(int[] preorder, int data ,int pIndex, int min, int max) {
     if (pIndex < preorder.length) {
       if (preorder[pIndex] > min && preorder[pIndex] < max) {
         Node root = new Node(data);
	       pIndex++;

        if (pIndex < preorder.length) {
           root.left = constructTree(preorder, preorder[pIndex], min, data);
           root.right = constructTree(preorder, preorder[pIndex],data, max);
         }
	   return root;
       }
	  }
    return null;
  }

Node constructTree(int pre[]) {
  int pIndex = 0;
  return contructTreeUtil(pre,pre[0],pIndex,Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

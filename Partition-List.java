/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

       For example:
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.

the basic idea is to maintain two queues, the first one stores all nodes with val less than x ,
and the second queue stores all the rest nodes. Then concat these two queues. 
*/

    public ListNode partition(Node head, int x) {
     if(head == null || head.next == null) return head;
    
     Node lessThan = new Node(-999);
     Node greaterThanOrEqualTo = new ListNode(-999);
     Node startDummy = lessThan;
     Node endDummy = greaterThanOrEqualTo;
     
     while(head != null){
       if(head.val < x){
         lessThan.next = head;
         lessThan = head;
       }
       
      if(head.val >= x){
         greaterThanOrEqualTo.next = head;
         greaterThanOrEqualTo = head;
      }
        head = head.next;
     }
      greaterThanOrEqualTo.next = null;
      lessThan.next = endDummy.next;
      return startDummy.next;
           
  }


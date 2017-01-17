/*
Intuition:

Imagine two runners running on a track at different speed. What happens when the track is actually a circle?
                                     Tortoise and The Hare Algorithm:
The space complexity can be reduced to O(1). O(1) by considering two pointers at different speed -
a slow pointer and a fast pointer. The slow pointer moves one step at a time while the fast pointer
moves two steps at a time.If there is no cycle in the list, the fast pointer will eventually reach 
the end and we can return false in this case.Now consider a cyclic list and imagine the slow and fast 
pointers are two runners racing around a circle track. The fastrunner will eventually meet the slow runner.

*/


public boolean hasCycle(Node head) {
      if(head == null) return false;
       
       Node tortoise = head;
       Node hare = head;
       while(hare.next != null && hare.next.next != null) {
         tortoise = tortoise.next;
         hare = hare.next.next;
          
         if(tortoise == hare) return true;
        }
        return false;
    }

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //int[] arr = new int[list.length];
        //ListNode[] arr = new ListNode[list.length];
    
        ListNode res;
        ListNode result = new ListNode(-1);
        res = result;
            //if (lists.length == 0) return result.next;
            // else 
            // {
            //     if(lists[0] == null)  return result.next;
            // }
        
      
        if(lists.length== 0 )  return result.next;
        else{
              PriorityQueue <ListNode> q = new PriorityQueue(lists.length, new ListComparator());
        for(int i = 0 ; i< lists.length; i ++)
        {
            if (lists[i]!= null) q.add(lists[i]);
        }
                  
          while(!q.isEmpty())
                  {
                      ListNode n = q.poll();

                            if(n != null)
                            {
                                ListNode nm = new ListNode(n.val);
                                res.next = nm;
                                // nm = res;
                                res = res.next;
                            }
                 
              
                      if(n != null && n.next != null )
                      {
                          q.add(n.next);
                       
                       
                       }
                  }
                  }     
                  
    
                  return result.next;
                  
                  }
}

class ListComparator implements Comparator<ListNode>{
    
    public int compare(ListNode l1, ListNode l2)
    {
        if(l1.val>l2.val) return 1;
        else if (l1.val< l2.val) return -1;
        else return 0;
    }
    
}

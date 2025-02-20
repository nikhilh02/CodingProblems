public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create a dummy node to simplify handling of the merged list
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while(list1!=null && list2!=null){
            // Attach the smaller node to the merged list
            if(list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;       // Move to the newly added node
        }

        // If any nodes remain in either list, attach them directly
        if(list1 != null)
            node.next = list1;
        else
            node.next = list2;

        // Return the merged list starting from dummy.next (skip dummy node)
        return dummy.next;
    }
}

/*
Time Complexity: O(n + m)
Space Complexity: O(1)
*/

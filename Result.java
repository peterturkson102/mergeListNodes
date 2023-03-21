 static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
 SinglyLinkedListNode start = head1.data <= head2.data ? head1 : head2;
        SinglyLinkedListNode head = new SinglyLinkedListNode(0);
        while (head1 != null && head2 != null){
            if (head1.data <= head2.data){
                head.next = head1;
                head = head1;
                head1 = head1.next;
            } else {
                head.next = head2;
                head = head2;
                head2 = head2.next;
            }
        }
        head.next = head1 == null? head2 : head1;
        return start;
    }

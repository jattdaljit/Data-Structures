public void reverseList(DoubleNode head, DoubleNode tail) {
        DoubleNode tempStart = head;
        DoubleNode tempEnd = tail;
        do{
            int temp = tempStart.val;
            tempStart.val = tempEnd.val;
            tempEnd.val = temp;

            tempStart = tempStart.next;
            tempEnd = tempEnd.prev;
        }while (tempStart != tempEnd && !(tempStart.prev == tempEnd) );
    }
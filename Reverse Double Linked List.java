  public void reverseList(DoubleNode head) {
        DoubleNode tempStart = head;
        while (head.next != null){
            head = head.next;
        }
        DoubleNode tempEnd = head;
        do{
            int temp = tempStart.val;
            tempStart.val = tempEnd.val;
            tempEnd.val = temp;

            tempStart = tempStart.next;
            tempEnd = tempEnd.prev;
        }while (tempStart != tempEnd && !(tempStart.prev == tempEnd) );
    }
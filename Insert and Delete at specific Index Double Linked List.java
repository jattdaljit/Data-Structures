public class DoubleLinkedList {

    DoubleNode list;
    DoubleNode head;
    DoubleNode tail;

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);
        doubleLinkedList.print();

        doubleLinkedList.insertAt(6,3);
        doubleLinkedList.print();


    }

    public void add(int val) {
        if (list == null) {
            list = new DoubleNode();
            list.next = null;
            list.prev = null;
            list.val = val;

            head = list;
            tail = list;
        } else {
            DoubleNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            DoubleNode doubleNode = new DoubleNode();
            doubleNode.val = val;
            doubleNode.next = null;
            doubleNode.prev = temp;
            temp.next = doubleNode;
            tail = doubleNode;
        }
    }

    public void print() {
        DoubleNode temp = head;
        if(temp == null) {
            System.out.println("Nothing to print");
            return;
        }
        do {
            System.out.println(temp.val + "\t");
            temp = temp.next;
        } while (temp != null);
    }


    public void deleteAt(int index) {
        DoubleNode temp = head;
        while (temp!= null && index > 1){
            index--;
            temp = temp.next;
        }

        if(temp == head) {
            head = temp.next;
            return;
        }

        if (temp.next == null) {
           temp.prev.next = null;
           return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void insertAt(int val, int index) {
        DoubleNode doubleNode = new DoubleNode();
        doubleNode.val = val;

        DoubleNode temp = head;
        while (temp!= null && index > 1){
            index--;
            temp = temp.next;
        }

        if(temp == head) {
           doubleNode.prev = null;
           doubleNode.next = head;
           head = doubleNode;
           return;
        }

        doubleNode.next = temp;
        doubleNode.prev = temp.prev;
        temp.prev.next = doubleNode;
        temp.prev = doubleNode;
    }


}

class DoubleNode {
    int val;
    DoubleNode next;
    DoubleNode prev;
}
public class SingleLinkedList {

    Node list;
    Node head;

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.print();
        singleLinkedList.add(1);
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        singleLinkedList.print();
        singleLinkedList.search(3);

        singleLinkedList.delete(1);
        singleLinkedList.print();
        singleLinkedList.add(4);
        singleLinkedList.add(5);
        singleLinkedList.add(6);
        singleLinkedList.delete(5);
        singleLinkedList.print();
    }

    public void add(int val) {
        if (list == null) {
            list = new Node();
            list.next = null;
            list.val = val;
            head = list;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node node = new Node();
            node.val = val;
            node.next = null;
            temp.next = node;
        }
    }

    public void print() {
        Node temp = head;
        if(temp == null) {
            System.out.println("Nothing to print");
            return;
        }
        do {
            System.out.println(temp.val + "\t");
            temp = temp.next;
        } while (temp != null);
    }


    public void search(int val) {
        Node temp = head;
        boolean flag = false;
        do {
            if (temp.val == val) {
                flag = true;
                break;
            }
            temp = temp.next;
        } while (temp != null);

        if (flag) {
            System.out.println("Value found");
        } else {
            System.out.println("Not found");
        }
    }

    public void delete(int val) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.val == val) {
            head = temp.next;
            System.out.println("Deleted value");
        } else {

            while (temp != null) {
                if (temp.val == val) {
                    prev.next = temp.next;
                    System.out.println("Deleted value");
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }


}

class Node {
    int val;
    Node next;
}
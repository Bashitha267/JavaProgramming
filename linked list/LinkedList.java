public class LinkedList {
    private Node head;

    public void add(int value) {
        Node newnode = new Node(value);
        if (head == null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    public void add(int index, int value) {
        Node newnode = new Node(value);
        // we are starting from current.next that means 1st element not 0th
        if (index == 0) {
            newnode.next = head;
            head = newnode;
            return;

        }
        Node current = head;

        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next; // 4,45 0 3 c cur 1 // 1 3 c 2 // 2,3 c 3 // if = 3,3 c 4
            count++;
        }

        newnode.next = current.next;

        current.next = newnode;

    }

    public void print() {
        Node current = head;
        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }
}

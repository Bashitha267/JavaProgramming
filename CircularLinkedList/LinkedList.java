public class LinkedList {
    public Node tail;
    public int size;

    

    // insertion at begining
    public void add(int value) {
        Node node = new Node(value);
        if (tail==null) {
            tail = node;
            tail.next = tail;
            size++;
        } else {
            node.next = tail.next;
            node.next = tail.next;
            tail.next = node;
            size++;
        }

    }

    // insertion at middle
    public void add(int position, int value) {
        Node node = new Node(value);
        Node current = tail.next;
        if (size == 0) {
            add(value);
            return;
        }
        if (position >= size) {
            System.out.println("Enter valid position to insert");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (i == position - 1) {
                node.next = current.next;
                current.next = node;
                size++;
                return;
            }
            current = current.next;
        }

    }

    public void print() {
        Node currentValue = tail.next;
        for (int i = 0; i < size; i++) {
            System.out.println(currentValue.value);
            currentValue = currentValue.next;
        }
        // System.out.println(currentValue.value);
    }
}

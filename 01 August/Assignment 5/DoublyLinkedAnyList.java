class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyAnyLinkedListADT<T> {
    Node<T> head;

    public DoublyAnyLinkedListADT() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void insertAtIndex(T data, int index) {
        if (index < 1 || index > getSize()+1) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 1) {
            insertAtFront(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        Node<T> current = head;
        for (int i = 1; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
    }

    public void deleteAtFront() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 1 || index > getSize()) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 1) {
            deleteAtFront();
            return;
        }
        Node<T> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public boolean search(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int getSize() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class DoublyLinkedAnyList {
    public static void main(String[] args) {
        DoublyAnyLinkedListADT<String> list = new DoublyAnyLinkedListADT<>();
		list.insertAtFront("first");
		list.insertAtFront("second");
		
	
	

    }
}

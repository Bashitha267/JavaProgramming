class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class StackADTAny<T> {
    Node<T> top;

    public StackADTAny() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            T data = top.data;
            top = top.next;
            return data;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return top.data;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node<T> current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class StackADTLLAnyType {
    public static void main(String[] args) {
        // StackADT stack = new StackADT();
        StackADTAny<String> slist = new StackADTAny<>();
        slist.push("Kamal");
        slist.push("Sunil");
        slist.display();
        StackADTAny<Integer> intList = new StackADTAny<>();
        intList.push(48);
        intList.push(78);
        intList.display();
        // stack.push("Java");
        // stack.push("Python");
        // stack.push("C++");

        // System.out.println("Stack elements:");
        // stack.display();

        // System.out.println("Peek element: " + stack.peek());
        // System.out.println("Popped element: " + stack.pop());

        // stack.display();
    }
}

class Node {
    int weight;
    int destination;
    Node next;

    public Node(int data, int destination) {
        weight = data;
        this.destination = destination;
        next = null;
    }
}

class LinkedListGraph {
    Node[] array;
    int maxSize;
    int currentSize;

    public LinkedListGraph(int maxSize) {
        this.maxSize = maxSize;
        array = new Node[maxSize];
        currentSize = -1;

    }

    public boolean isEmpty() {
        return currentSize == -1;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void insertVertex() {
        if (isFull()) {
            System.out.println("Graph is full");
        } else {
            currentSize++;
        }
    }

    public void insertEdge(int source, int destination, int weight) {
        Node node = new Node(weight, destination);
        // source to dest
        node.next = array[source];
        array[source] = node;

        Node node2 = new Node(weight, source);
        node2.next = array[destination];
        array[destination] = node2;
    }

    public boolean searchEdge(int source, int destination) {
        Node currentNode = array[source];
        while (currentNode != null) {
            if (currentNode.destination == destination) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void traversal() {
        if (isEmpty()) {
            System.out.println("Graph is empty");
        } else {
            for (int i = 0; i < maxSize; i++) {
                if (array[i] != null) {
                    System.out.print("Source: " + i + " Destinations:");
                    Node currentNode = array[i];
                    while (currentNode != null) {
                        System.out.print(" " + currentNode.destination);
                        currentNode = currentNode.next;
                    }
                    System.out.println();
                }

            }
        }

    }

    public void deleteVertex(int vertex) {
        if (isEmpty()) {
            System.out.println("Graph is empty");

        } else if (vertex > 0 && vertex < currentSize) {
            array[vertex] = null;
            currentSize--;
            for (int i = 0; i < maxSize; i++) {
                Node currentNode = array[i];
                if (array[i] != null) {
                    while (currentNode.next.destination != vertex) {
                        currentNode = currentNode.next;
                    }
                    if (currentNode.destination == vertex) {
                        currentNode.next = currentNode.next.next;
                    }
                }
            }

        } else {
            System.out.println("invalid vertex");

        }
    }

}

class GraphLLADT {
    public static void main(String[] args) {
        LinkedListGraph graph = new LinkedListGraph(5);
        graph.insertVertex();
        graph.insertVertex();
        graph.insertVertex();
        graph.insertVertex();
        graph.insertVertex();
        graph.insertVertex();

        System.out.println(graph.isFull());

        graph.insertEdge(0, 1, 10);
        graph.insertEdge(0, 2, 25);
        graph.traversal();

    }
}

class Node {
    char destination;
    int weight;
    Node next;

    public Node(int weight, char destination) {
        this.weight = weight;
        this.destination = destination;
        next = null;
    }
}

class Graph {
    char mapping[];
    Node arr[];
    int maxSize;
    int currentSize;
    char visited[];
    int visitedCurrent = -1;

    public Graph(int max) {
        arr = new Node[max];
        mapping = new char[max];
        visited = new char[max];
        maxSize = max;
        currentSize = -1;

    }

    public boolean isEmpty() {
        return currentSize == -1;
    }

    public boolean isFull() {
        return currentSize == maxSize - 1;
    }

    private int mapSearch(char vertex) {
        if (isEmpty()) {
            return -1;
        }
        for (int i = 0; i <= currentSize; i++) {
            if (vertex == mapping[i]) {
                return i;
            }
        }
        return -1;
    }

    private int visitedSearch(char vertex) {

        for (int i = 0; i <= visitedCurrent; i++) {
            if (vertex == visited[i]) {
                return i;
            }
        }
        return -1;
    }

    public void insertVertex(char vertex) {
        if (isEmpty()) {
            currentSize++;
            mapping[currentSize] = vertex;
            System.out.println("Inserted New Vertex:" + vertex);

            return;

        }
        if (isFull()) {
            System.out.println("Graph is Full");
            return;
        }
        if (mapSearch(vertex) == -1) {
            currentSize++;
            mapping[currentSize] = vertex;
            System.out.println("Inserted New Vertex:" + vertex);
            return;

        } else {
            System.out.println("Vertex is already inserted");
            return;

        }
    }

    public void insertEdge(char source, char destination, int weight) {
        int indexSource = mapSearch(source);
        int indexDes = mapSearch(destination);
        if (indexDes == -1 || indexSource == -1) {
            System.out.println("Invalid Source or destination");
            return;
        } else {
            Node node = new Node(weight, destination);
            node.next = arr[indexSource];
            arr[indexSource] = node;

            Node node2 = new Node(weight, source);
            node2.next = arr[indexDes];
            arr[indexDes] = node2;

            return;
        }
    }

    public void travel() {
        if (isEmpty()) {
            System.out.println("Graph is empty");
            return;
        }
        for (int i = 0; i <= currentSize; i++) {

            Node current = arr[i];
            while (current != null) {
                System.out.print(
                        mapping[i] + " = > " + mapping[mapSearch(current.destination)] + "  Distance: "
                                + current.weight);
                System.out.println();
                current = current.next;

            }

        }
    }

    // public int findsmallest() {

    // }

    public void findShorted(char start) {
        visitedCurrent = -1;
        char shortest[] = new char[maxSize];

        int table[][] = new int[maxSize][2];

        for (int i = 0; i <= currentSize; i++) {
            table[i][0] = 58000;
            table[i][1] = -1;
        }
        int startIndex = mapSearch(start);

        table[startIndex][0] = 0;
        table[startIndex][1] = startIndex;
        int minIndex = startIndex;
        // calculate path

        while (visitedCurrent != currentSize) {

            // int minIndex = -1;
            visitedCurrent++;
            visited[visitedCurrent] = start;

            Node current = arr[startIndex];
            while (current != null) {

                int indexDesti = mapSearch(current.destination);

                int newDis = table[startIndex][0] + current.weight;

                if (table[indexDesti][0] > newDis) {
                    table[indexDesti][0] = newDis;
                    table[indexDesti][1] = startIndex;

                }
                current = current.next;
            }
            //
            int minDist = 100000;

            for (int i = 0; i < currentSize; i++) {
                if (visitedSearch(mapping[i]) == -1 && table[i][0] < minDist) {
                    minDist = table[i][0];
                    minIndex = i;
                }

            }
            startIndex = minIndex;
            start = mapping[minIndex];
        }
        for (int i = 0; i <= currentSize; i++) {
            System.out.println(mapping[i] + "," + table[i][0] + "," + mapping[table[i][1]]);
        }

    }
}

class GraphLLADT {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        System.out.println(graph.isEmpty());
        graph.insertVertex('A');
        graph.insertVertex('B');
        graph.insertVertex('C');
        graph.insertVertex('D');
        graph.insertVertex('E');
        graph.insertVertex('F');

        // graph.insertVertex('F');
        graph.insertEdge('A', 'B', 2);
        graph.insertEdge('A', 'D', 8);

        graph.insertEdge('B', 'E', 6);
        graph.insertEdge('B', 'D', 5);

        graph.insertEdge('D', 'E', 3);
        graph.insertEdge('D', 'F', 2);
        graph.insertEdge('F', 'C', 3);
        graph.insertEdge('E', 'C', 9);
        graph.insertEdge('E', 'F', 1);

        graph.findShorted('A');
        // graph.travel();
    }
}

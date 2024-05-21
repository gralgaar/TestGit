package home_work.lesson028.task4.structure;

public class Node<N> {

    private final N data;
    private final Node<N> previousNode;


    public Node(N data, Node<N> previousNode) {
        this.data = data;
        this.previousNode = previousNode;
    }

    public Node<N> getPreviousNode() {
        return previousNode;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public N getData() {
        return this.data;
    }
}

package home_work.lesson028.task4.structure;

import home_work.lesson028.task3.exception.ElementNotFoundException;

public class Stack<N> {
    private Node<N> topNode;
    private int size;

    public Stack() {
    }

    public void add(N dataToNode) {
        this.topNode = new Node<N>(dataToNode, this.topNode);
        this.size++;
        //System.out.println("текущая глубина стека " + this.size);
        //System.out.println(this.topNode + "\n");

    }

    public void delete() {
        if (this.topNode.getPreviousNode() == null) {
            throw new ElementNotFoundException();
        }

        this.topNode = this.topNode.getPreviousNode();
        this.size--;
    }

    public int getSize() {
        return this.size;
    }

    public Node<N> getTopNode() {
        return this.topNode;
    }

    public Node<N> find(N data) {
        Node<N> checkNode = this.topNode;

        while (checkNode.getData() != data) {
            if (checkNode.getPreviousNode() == null) {
                throw new ElementNotFoundException();
            }
            checkNode = checkNode.getPreviousNode();
        }
        return checkNode;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<N> tempNode = this.topNode;

        if (this.topNode == null) {
            return "null";
        }

        while (tempNode != null) {
            str.append(" [" + tempNode + "] ");
            tempNode = tempNode.getPreviousNode();
        }
        return str.toString();
    }
}

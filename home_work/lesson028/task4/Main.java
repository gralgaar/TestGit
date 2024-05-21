package home_work.lesson028.task4;

import home_work.lesson028.task4.structure.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        System.out.println(stack.getTopNode() + " " + stack.getSize());

        stack.delete();
        System.out.println(stack.getTopNode() + " " + stack.getSize());

        System.out.println("Найден элемент " + stack.find(4));
        //stack.delete();
        //System.out.println("Найден элемент " + stack.find(7));   выводит ошибку т.к. искомый элемент был удалён

        System.out.println("Стек " + stack);


    }
}

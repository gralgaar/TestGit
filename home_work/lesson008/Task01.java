package home_work.lesson008;

import org.w3c.dom.css.Counter;

public class Task01 {
    public static void main(String[] args) {
        Count count01 = new Count("Class01");
        count01.print();
        count01.sub(50);
        count01.print();
        count01.add(2);
        count01.print();

        Count count02 = new Count("Class01", 43);
        count02.print();
    }


}

class Count {
    String name;
    int count;

    Count(String name) {
        this.name = name;
        this.count = 0;
    }

    Count(String name, int count) {
        this.name = name;
        this.count = count;

    }

    void print() {
        System.out.printf("name: %s      count: %d \n", name, count);
    }

    void add(int n) {
        this.count += n;
    }

    void sub(int n) {
        this.count -= n;
    }
}



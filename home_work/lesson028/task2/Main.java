package home_work.lesson028.task2;

import home_work.lesson028.task2.wrap.Wrapper;

public class Main {
    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("dsdfg");
        Wrapper<Object> nullWrapper = new Wrapper<>();


        System.out.println(stringWrapper.isNull());
        System.out.println(nullWrapper.isNull());
    }
}

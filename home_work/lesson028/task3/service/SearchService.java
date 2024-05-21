package home_work.lesson028.task3.service;

import home_work.lesson028.task3.exception.ElementNotFoundException;

import java.util.Objects;

public class SearchService<N> {
    private final N[] array;

    public SearchService(N[] array) {
        this.array = array;
    }

    public N find(N SerchingValue) {


        for (N element : array) {
            if (Objects.equals(element, SerchingValue)) {
                return element;
            }
        }
        throw new ElementNotFoundException();
    }
}
package home_work.lesson028.task3;

import home_work.lesson028.task3.service.SearchService;

public class Main {
    public static void main(String[] args) {

        String[] str = {"14", "2 4", "2gsfgb", "fw54wg", "werv456", "tyv4g b", "w543b56b", "sv67nu", "b", "b", "b", "b", "b"};
        SearchService<String> SearchSting = new SearchService<>(str);
        String b = "b";
        System.out.println(b);
        System.out.println(SearchSting.find(b));
    }
}

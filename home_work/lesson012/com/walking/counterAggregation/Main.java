package home_work.lesson012.com.walking.counterAggregation;

/**
 * Реализовать класс-счетчик.
 * Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
 * <p>
 * Реализовать для созданного класса конструктор с двумя параметрами,
 * с одним (значение счетчика в таком случае инициализировать как 0),
 * методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целом значение.
 * Методы должны возвращать актуальное значение счетчика.
 * <p>
 * Используя созданный класс,
 * посчитать количество четных и количество нечетных чисел в ряду от 1 до 100.
 * Конечные показатели счетчиков вывести в консоль.
 */
public class Main {
    public static void main(String[] args) {
        //создаём класс, который управляет счётчиками
        CounterService service = new CounterService();

        //создаём внутри этого класса счётчики
        service.create(CounterService.GAS);
        service.create(CounterService.COLD_WATER);
        service.create(CounterService.ELECTRICITY, 456);
        service.create(7, 657);


        service.printCounter(0);
        service.printCounter(1);
        service.printCounter(2);
        service.printCounter(3);
    }

}

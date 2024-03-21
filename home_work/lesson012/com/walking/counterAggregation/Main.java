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
        Counter gas = new Counter(Counter.GAS);
        Counter cWater = new Counter(Counter.COLD_WATER);
        Counter electricity = new Counter(Counter.ELECTRICITY, 657);

        gas.printCounter();
        cWater.printCounter();
        electricity.printCounter();
    }

}

package home_work.lesson012.com.walking.counterAggregation;

public class CounterService {
    public final static int GAS = 0;
    public final static int COLD_WATER = 1;
    public final static int HOT_WATER = 2;
    public final static int ELECTRICITY = 3;

    private int counterAmount = 0;


    private Counter[] counters = new Counter[10];


    public CounterService() {
    }

    public void create(int type) {
        //берём колличество имеющихся счётчиков. Это же число означает серийный номер
        counterAmount = this.counterAmount;

        //создаём новый счётчик
        Counter counter = new Counter(type, counterAmount);

        //запихиваем этот счётчик в массив, где хранится список всех счётчиков.
        counters[this.counterAmount] = counter;

        //не забываем увеличить число хранимых счётчиков на единицу
        this.counterAmount++;

    }

    public void create(int type, int indication) {
        //берём колличество имеющихся счётчиков. Это же число означает серийный номер
        counterAmount = this.counterAmount;

        //создаём новый счётчик
        Counter counter = new Counter(type, counterAmount, indication);

        //запихиваем этот счётчик в массив, где хранится список всех счётчиков.
        counters[this.counterAmount] = counter;

        //не забываем увеличить число хранимых счётчиков на единицу
        this.counterAmount++;

    }

    public void printCounter(int counter) {
        //берём счётчик из массива счётчиков. Номер счётчика counter. И отдаём ему команду печатать
        this.counters[counter].printCounter();
    }

    public void increaseIndication(Counter counter, int value) {
        counter.increase(value);
    }
}

package home_work.lesson014.task01;

public class ShapeController {
    public final int SQUARE = 0;
    public final int TRIANGLE = 1;

    protected Shape shape;

    public ShapeController(int shape, int size) {
        this.shape = switch (shape) {
            case SQUARE:
                yield new Square(size);
            case TRIANGLE:
                yield new Triangle(size);
            default:
                yield new Square(size); //тут должна быть ошибка выполнения, но пусть будет возвращать квадрат по умолчанию
        };

    }

    public void print() {
        this.shape.print();
    }
}

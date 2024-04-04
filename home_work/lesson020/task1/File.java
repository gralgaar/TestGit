package home_work.lesson020.task1;

public class File {
    private final String UNITS = "Кбайт";
    private String name;
    private int size;
    private TypeOfFile type;

    File(String name, TypeOfFile type, int size) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Файл \"" + this.name + "." + type.getName() + "\" " + this.size + " " + UNITS;
    }
}

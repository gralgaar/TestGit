package home_work.lesson020.task1;

public enum TypeOfFile {
    EXE("exe"),
    TXT("txt"),
    AVI("avi"),
    PNG("png"),
    MP4("mp4"),
    OGG("ogg"),
    JPG("jpg");

    private final String name;

    TypeOfFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

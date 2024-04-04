package home_work.lesson020.task1;

public class FileManager {
    private File[] files;

    FileManager(File... files) {
        //инициализация пустого массива
        this.files = new File[files.length];

        //заполняю полученными файлами
        for (int i = 0; i < files.length; i++) {
            this.files[i] = files[i];
        }
    }

    public void printAll() {
        for (File file : this.files) {
            System.out.println(file.toString());
        }
    }
}

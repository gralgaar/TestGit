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

    public void printFiles() {
        for (File file : this.files) {
            System.out.println(file.toString());
        }
    }

    public void printFiles(File[] files) {
        for (File file : files) {
            System.out.println(file.toString());
        }
    }

    public void findFiles(String name) throws FileNotFoundExeption {

        int countFindedFiles = 0;

        for (File file : this.files) {
            if (file.getName().contains(name)) countFindedFiles++; //если файл содержит искомое подслово
        }

        if (countFindedFiles == 0) throw new FileNotFoundExeption("Отсутствует файл со строкой", name);

        File[] findFiles = new File[countFindedFiles];
        int i = 0;
        for (File file : this.files) {
            if (file.getName().contains(name)) {
                findFiles[i] = file;
                i++;
            }
        }
        this.printFiles(findFiles);
    }

    class FileNotFoundExeption extends Exception {

        private String name;

        public String getName() {
            return name;
        }

        public FileNotFoundExeption(String message, String name) {

            super(message);
            this.name = name;
        }
    }
}

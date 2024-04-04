package home_work.lesson020.task1;


public class Main {
    public static void main(String[] args) {
        File file01 = new File("Music 01", TypeOfFile.MP4, 8453);
        File file02 = new File("Music 02", TypeOfFile.MP4, 8453);
        File file03 = new File("Music 03", TypeOfFile.MP4, 8453);
        File file04 = new File("Music 05", TypeOfFile.MP4, 8453);

        FileManager fileManager = new FileManager(file01, file02, file03, file04);

        fileManager.printAll();
    }
}

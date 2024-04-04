package home_work.lesson020.task1;


public class Main {
    public static void main(String[] args) {

        FileManager fileManager = new FileManager(
                new File("Music 01", TypeOfFile.MP4, 8453),
                new File("Music 02", TypeOfFile.MP4, 8453),
                new File("Music 03", TypeOfFile.MP4, 8453),
                new File("Music 04", TypeOfFile.MP4, 8453),
                new File("smileXXX", TypeOfFile.JPG, 8453),
                new File("Music 01", TypeOfFile.MP4, 8453),
                new File("Video 01", TypeOfFile.OGG, 8453)
        );

        fileManager.printFiles();
        System.out.println();
        try {
            fileManager.findFiles("04kjh");
        } catch (FileManager.AbsentFileExeption ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getName());
        }
    }
}

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count=0; int x=0;
        do {
            System.out.println("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if ((fileExists==false)||(isDirectory==true)) {
                System.out.println("Файл не существует или указанный путь не является путем к файлу!");
                continue;
            }
            else {
                count++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер "+count);
            }
        }
        while (true);
    }
}

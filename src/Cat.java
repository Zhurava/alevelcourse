import java.io.*;
import java.util.Scanner;

public class Cat {
    public static void main(String args[]) {

        Scanner k = new Scanner(System.in);
        System.out.println(" Введите путь к файлу: ");
        String path = k.nextLine();

        try (InputStream is = new FileInputStream(path);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File sample.txt not found!");
        } catch (IOException e) {
            System.err.println("Error on file read!");
            e.printStackTrace();
        }
    }
}

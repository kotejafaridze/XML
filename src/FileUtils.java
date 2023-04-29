import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {

    private FileUtils(){}

    public static void createFile() throws IOException {
        File file = new File("tazo.txt");
        if(file.createNewFile()){
            System.out.println(file.getName());
        }
    }

    public  static void writeInFile()throws IOException{
        FileWriter fileWriter = new FileWriter("tazo.txt");
        fileWriter.write("bla bla bla");
        fileWriter.flush();
        fileWriter.close();
    }

    public static void readFromFile() throws FileNotFoundException {
        File file = new  File("tazo.txt");
        Scanner scanner  = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());

        }

        scanner.close();
    }

    public static void deleteFile(){
        File file = new File("tazo.txt");
        if(file.delete()){
            System.out.println("file deleted");
        }else{
            System.out.println("no");
        }
    }
}

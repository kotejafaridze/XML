import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//
//        Student nika = new Student();
//        nika.setFirstName("nika");
//        nika.setLastName("Japaridze");
//        nika.setUniversity("UG");
//
//        Student tamaz = new Student();
//        nika.setFirstName("kote ");
//        nika.setLastName("vanishvili");
//        nika.setUniversity("btu");
//
////        System.out.println(tamaz.getCounter());//roca privatea
////        System.out.println(Student.counter);
////        Student.counter = 100;
////
//        System.out.println(Student.getCounter());
//        System.out.println(Student.getCounter());
//        System.out.println(Student.getCounter());
//
//        try{
//            FileUtils.createFile();
//        }catch (IOException e){
//        throw new RuntimeException(e);
//        }
//        try{
//        File file = new File("tazo.txt");
//        FileReader fr = new FileReader(file);
//        BufferedReader br = new BufferedReader(fr);
//        }catch (FileNotFoundException e){
//
//        }
//
//        FileUtils.deleteFile();
//        try {
//            XMLUtils.createXML();
//        } catch (ParserConfigurationException e) {
//            throw new RuntimeException(e);
//        } catch (TransformerException e) {
//            throw new RuntimeException(e);
//        }


        try {
            XMLUtils.parseXML();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }


    }


}
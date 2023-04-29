import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class XMLUtils {


    public static void createXML() throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.newDocument();
        Element rootElement = document.createElement("students");
        document.appendChild(rootElement);

        Element studentElement = document.createElement("student");
        studentElement.setAttribute("id", "1");
        rootElement.appendChild(studentElement);

        Element firstNameElement = document.createElement("firstname");
        firstNameElement.appendChild(document.createTextNode("nikoloz"));
        studentElement.appendChild(firstNameElement);

        Element lastNameElement = document.createElement("lastname");
        lastNameElement.appendChild(document.createTextNode("nikoloz"));
        studentElement.appendChild(lastNameElement);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult streamResult = new StreamResult(new File("kote.xml") );
        DOMSource domSource = new DOMSource(document);
        transformer.transform(domSource,streamResult);






    }

    public  static void parseXML() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("kote.xml"));
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("lastname");
        String lastname = nodeList.item(0).getTextContent();
        System.out.println(lastname);


    }

}

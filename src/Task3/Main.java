package Task3;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException,IOException,SAXException,XMLStreamException,TransformerException {
        String path = "/Users/alexandrzhidkov/Documents/УчебаJava/Курс/JavaAdvanced/Lesson7/HW7/HomeWork7Adv/src/InfoTask3/city.xml";
        XMLOutputFactory factory =  XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream(path));

        writer.writeStartDocument();
        writer.writeStartElement("city");
        writer.writeAttribute("size", "big");
        writer.writeCharacters("Kiev");
        writer.writeStartElement("street");
        writer.writeCharacters("Ivana Mykolaichuka");
        writer.writeStartElement("building");
        writer.writeCharacters("3");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();




    }

}

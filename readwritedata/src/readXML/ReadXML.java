package readXML;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {
	
	public void dynamicallyReadXML () throws SAXException, IOException, ParserConfigurationException, XPathExpressionException{
		File inputFile = new File("./Data/xmlInput.xml");

		FileInputStream fis = new FileInputStream(inputFile);

		// Create a DocumentBuilder
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder docbuilder = dbFactory.newDocumentBuilder();

		// Extract data from the XML file. Package should be org.w3c.dom
		Document doc = docbuilder.parse(fis);

		// Extract the root element Package should be org.w3c.dom
		Element root = doc.getDocumentElement();

		// to get the list of elements with attributes

		System.out.println(root.getNodeName());
	
		XPathFactory xPathfactory = XPathFactory.newInstance();
		
		XPath xpath = xPathfactory.newXPath();
		
		XPathExpression expr = xpath.compile("//student[1]/");
		
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		
		NodeList nodes = (NodeList) result;
		
		for (int i = 0; i < nodes.getLength(); i++) {
		    System.out.println(nodes.item(i).getTextContent());
		}
	
	}

	public void readXMLFile() throws ParserConfigurationException, SAXException, IOException {

		File inputFile = new File("./Data/xmlInput.xml");

		FileInputStream fis = new FileInputStream(inputFile);

		// Create a DocumentBuilder
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder docbuilder = dbFactory.newDocumentBuilder();

		// Extract data from the XML file. Package should be org.w3c.dom
		Document doc = docbuilder.parse(fis);

		// Extract the root element Package should be org.w3c.dom
		Element root = doc.getDocumentElement();

		// to get the list of elements with attributes

		System.out.println(root.getNodeName());

		NodeList parentNode = doc.getElementsByTagName("student");

		int parentnodeRepeatCount = parentNode.getLength();

		System.out.println("no of childnodes = " + parentnodeRepeatCount);

		for (int i = 0; i < parentnodeRepeatCount; i++) {

			Node node = parentNode.item(i);

			// checking whether it is a node to fetch its child nodes
			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element parentEle = (Element) node;

				System.out.println(parentEle.getElementsByTagName("firstname").item(0).getTextContent());

			}

		}

	}
	
	/*public void methodTwo(){
		  SAXBuilder builder = new SAXBuilder();
	        Document doc = builder.build(new File("test.xml"));
	        Element root = doc.getRootElement();
	        for (Element element : root.getChildren("TaskID")) {
	            System.out.println(element.getText());
	        }
	}
*/
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {

		ReadXML rx = new ReadXML();

		//rx.readXMLFile();
		
		rx.dynamicallyReadXML();

	}

}

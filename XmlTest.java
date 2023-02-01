

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class XmlTest {
	private static final File xml = new File("./res/관광.xml");
	public static void main(String[] args) {
		try {
//			sax();
			dom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void sax() throws Exception {
		List<TripDto> list = new ArrayList<>();
		// 코드 완성
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(xml, new DefaultHandler() {
			TripDto tripDto;
			String content;
			@Override
			public void startElement(String uri, String localName, String qName, Attributes attributes)
					throws SAXException {
				if (qName.equals("item")) {
					tripDto = new TripDto();
				}
			}
			@Override
			public void endElement(String uri, String localName, String qName) throws SAXException {
				if (qName.equals("trrsrtNm")) {
					tripDto.setTouristDestination(content);
				} else if (qName.equals("rdnmadr")) {
					tripDto.setStreetAddress(content);
				} else if (qName.equals("item")) {
					list.add(tripDto);
					tripDto = null;
				} 
			}

			@Override
			public void characters(char[] ch, int start, int length) throws SAXException {
				content = new String(ch, start, length);
			}
		});
		
        print(list);
	}

	private static void dom() throws Exception {
		List<TripDto> list = new ArrayList<>();
		// 코드 완성
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		Document doc = parser.parse(xml);	
		Element root = doc.getDocumentElement();
		NodeList items = root.getElementsByTagName("item");
		System.out.println(items.getLength());
		for (int i = 0; i < items.getLength(); i++) {
			list.add(makeTripDto(items.item(i)));
		}
		print(list);
	}
	private static TripDto makeTripDto(Node node) {
		TripDto trip = new TripDto();
		NodeList childs = node.getChildNodes();
		for (int i = 0; i < childs.getLength(); i++) {
			Node child = childs.item(i);
			String name = child.getNodeName();
			String value = child.getTextContent();
			if (name.equals("#text")) continue;
			
			switch (name) {
			case "trrsrtNm":
				trip.setTouristDestination(value); 
				break;
			case "rdnmadr":
				trip.setStreetAddress(value); 
				break;
			case "lnmadr":
				trip.setLotAddress(value); 
				break;
			case "latitude":
				trip.setLat(Double.parseDouble(value)); 
				break;
			case "longitude":
				trip.setLng(Double.parseDouble(value)); 
				break;
			case "trrsrtIntrcn":
				trip.setInfo(value); 
				break;
			case "phoneNumber":
				trip.setTel(value); 
				break;
			}
		}
		return trip;
	}
	
	private static void print(List<TripDto> list) {
		for (TripDto trip : list) {
			System.out.println(trip);
		}
	}
}






















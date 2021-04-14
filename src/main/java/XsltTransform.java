import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltTransform {
    public static void main(String[] args) throws TransformerException {
        Source xslt = new StreamSource(XsltTransform.class.getResourceAsStream("/transform_csv.xslt"));
        Source xml = new StreamSource(XsltTransform.class.getResourceAsStream("/input.xml"));
        Result out = new StreamResult(new File("a.csv"));

        TransformerFactory factory = TransformerFactory.newInstance();
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

        Transformer transformer = factory.newTransformer(xslt);
        transformer.transform(xml, out);
    }
}

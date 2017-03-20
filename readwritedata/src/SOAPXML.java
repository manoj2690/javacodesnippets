package runsoapui;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
/*import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;*/
import java.net.URL;
import java.net.URLConnection;

public class SOAPXML {

	public static void sendSoapRequest() throws Exception {
		// use this if you need proxy to connect

		// Proxy proxy = new Proxy(Type.HTTP, new
		// InetSocketAddress("http://tmgate.TechM/wpad.dat", 8080));
		String SOAPUrl = "http://www.webservicex.com/CurrencyConvertor.asmx?wsdl";
		String xmlFile2Send = "./XML requests/Currency Converter.xml";
		String responseFileName = "./XML response/response_" + (int) Math.floor(Math.random() * 100000) + ".xml";
		String soapAction = "http://www.webserviceX.NET/ConversionRate";

		// Create the connection with http
		URL url = new URL(SOAPUrl);
		// URLConnection connection = url.openConnection(proxy);
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		FileInputStream fin = new FileInputStream(xmlFile2Send);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		copy(fin, bout);
		fin.close();

		byte[] b = bout.toByteArray();

		// Set the appropriate HTTP parameters.
		httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
		httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
		httpConn.setRequestProperty("SOAPAction", soapAction);
		// httpConn.setRequestMethod("POST");

		httpConn.setDoOutput(true);

		// send the XML that was read in to b.

		OutputStream out = httpConn.getOutputStream();
		out.write(b);
		out.close();

		// Read the response.
		httpConn.connect();
		System.out.println("http connection status :" + httpConn.getResponseMessage());

		InputStreamReader isr = null;

		System.out.println("==============================================================");

		isr = new InputStreamReader(httpConn.getInputStream());

		BufferedReader in = new BufferedReader(isr);

		String inputLine;
		FileWriter fw = new FileWriter(new File(responseFileName), false);
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
			fw.write(inputLine);
		}
		// FileOutputStream fos = new FileOutputStream(new File
		// (responseFileName), false);
		// copy(httpConn.getInputStream(), fos);

		fw.close();
		in.close();
	}

	public static void copy(InputStream in, OutputStream out) throws IOException {

		synchronized (in) {
			synchronized (out) {
				byte[] buffer = new byte[256];
				while (true) {
					int bytesRead = in.read(buffer);
					if (bytesRead == -1)
						break;
					out.write(buffer, 0, bytesRead);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		SOAPXML s = new SOAPXML();

		SOAPXML.sendSoapRequest();

	}

}

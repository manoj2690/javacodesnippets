package customreports;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomReports {

	static StringBuilder htmlStringBuilder;

	static String tableStyleClass = "table table-bordered";

	public void startReport(String pageTitle) {
		// BootStrap template

		String bootstrap = "<meta charset=\"utf-8\">"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">"
				+ "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>"
				+ "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>";

		// define a HTML String Builder
		htmlStringBuilder = new StringBuilder();

		// append html header and title
		htmlStringBuilder
				.append("<!DOCTYPE html><html lang=\"en\"><head><title>"
						+ pageTitle + "</title>" + bootstrap + "</head>");

		// append body
		htmlStringBuilder.append("<body>" + "<div class=\"container\">"
				+ "<h2>Test Report</h2>"
				+ "<p>*Report contains test case wise status</p>");

	}

	/* Summary table */
	public void createSummaryTable(String colHeader1, String colHeader2,
			String colHeader3) {

		// append table
		htmlStringBuilder.append("<table class=\"" + tableStyleClass + "\">");

		// append table header
		htmlStringBuilder.append("<thead><tr><th>" + colHeader1 + "</th><th>"
				+ colHeader2 + "</th><th>" + colHeader3 + "</th></tr>");
	}

	public void appendTableRow(String tcID, String tcName, String tcStatus) {

		// append table row
		htmlStringBuilder.append("<tr><td>" + tcID + "</td><td>" + tcName
				+ "</td><td>" + tcStatus + "</td></tr>");

	}

	public void completeSummaryTable() {

		// close table
		htmlStringBuilder.append("</table>");
	}

	/* Create testStepwise table */

	public void createTestStepTable(String testStep, String testStepName, String stepStatus,
			String startTime, String endTime, String Duration) {

		// append table
		htmlStringBuilder.append("<div class=\"container\"><table class=\"" + tableStyleClass + "\">");

		// append table header
		htmlStringBuilder.append("<thead>" + "<tr><th>" + testStep
				+ "</th><th>" +testStepName+ "</th><th>" + stepStatus + "</th><th>" + startTime
				+ "</th><th>" + endTime + "</th><th>"+ Duration +"</th></tr>");
	}

	public void appendTestStepTableRow(String tcName, String testStepName, String stepStatus,
			Date startTime, Date endTime) {
		
		long duration = endTime.getTime() - startTime.getTime();

		// append table row
		htmlStringBuilder.append("<tr><td>" + tcName + "</td><td>"+ testStepName + "</td><td>" + stepStatus
				+ "</td><td>" + startTime + "</td><td>"+ endTime + "</td><td>"+ duration + "</td></tr>");

	}

	public void completeTestStepTable() {

		// close table
		htmlStringBuilder.append("</table>");
	}

	public void completeReport() {

		htmlStringBuilder.append("</body></html>");

		// write html string content to a file
		String fileName = "Report_"
				+ new SimpleDateFormat("ddmmyyyy_hhmmss").format(new Date())
				+ ".html";
		// String fileName = "Report_"+ (int)Math.floor(Math.random() * 1001) +
		// ".html";
		try {
			WriteToFile(htmlStringBuilder.toString(), fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void WriteToFile(String fileContent, String fileName)
			throws IOException {
		String projectPath = "D:\\Workspace_test\\test\\Reports";
		String tempFile = projectPath + File.separator + fileName;
		File file = new File(tempFile);
		// if file does exists, then delete and create a new file
		/*
		 * if (file.exists()) { try { File newFileName = new File(projectPath +
		 * File.separator + "backup_" + fileName); file.renameTo(newFileName);
		 * file.createNewFile(); } catch (IOException e) { e.printStackTrace();
		 * } }
		 */
		// write to file with OutputStreamWriter
		OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
		Writer writer = new OutputStreamWriter(outputStream);
		writer.write(fileContent);
		writer.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomReports c = new CustomReports();

		// BeforeSuite in Testng
		
		c.startReport("Test Report");
		
		c.createSummaryTable("TCId", "TC Name", "Run Status");

		// call in After Test --> using listeners
		c.appendTableRow("001", "TC1", "Completed");

		c.appendTableRow("002", "TC2", "Pending");

		c.appendTableRow("003", "TC3", "No Run");
		
		// After suite in testng
		c.completeSummaryTable();
		
		//call during every method/step
		
		c.createTestStepTable("testCase", "testStepName", "stepStatus", "startTime", "endTime", "Duration");
		
		c.appendTestStepTableRow("TC1", "1", "Passed", new Date(), new Date());

		// After suite in testng
		c.completeTestStepTable();
		
		c.completeReport();

	}

}

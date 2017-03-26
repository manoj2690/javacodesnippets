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
		String jq = "<script type=\"text/javascript\" src=\"/assets/script/canvasjs.min.js\"></script>"
				+ "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>"
				+ "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>";

		String bootstrap = "<meta charset=\"utf-8\">"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">";

		String popupJS = "<SCRIPT TYPE=\"text/javascript\"> function popup(mylink, windowname) "
				+ "{ if (! window.focus)return true; var href; if (typeof(mylink) == 'string') href=mylink; "
				+ "else href=mylink.href; window.open(href, windowname, 'width=400,height=200,scrollbars=yes'); return false; } "
				+ "</SCRIPT>";

		/*
		 * String chartJS = "<script type=\"text/javascript\">" +
		 * "window.onload = function () {" +
		 * "var chart = new CanvasJS.Chart(\"chartContainer\"," +
		 * "{title:{text: \"Test Summary\"}," + "legend: {" + "maxWidth: 350," +
		 * "itemWidth: 120" + "}," + "data: [" + "{" + "type: \"pie\"," +
		 * " showInLegend: true," + "  legendText: \"{indexLabel}\"," +
		 * "   dataPoints: [" +
		 * "  { y: 4181563, indexLabel: \"PlayStation 3\" }," +
		 * "   { y: 2175498, indexLabel: \"Wii\" }," +
		 * "   { y: 3125844, indexLabel: \"Xbox 360\" }," +
		 * "   { y: 1176121, indexLabel: \"Nintendo DS\"}," +
		 * "  { y: 1727161, indexLabel: \"PSP\" }," +
		 * "   { y: 4303364, indexLabel: \"Nintendo 3DS\"}," +
		 * "  { y: 1717786, indexLabel: \"PS Vita\"}" + " ]" + "  }" + " ]" +
		 * "  });" + "  chart.render();" + "}" + "</script>";
		 */

		String chartJS = "<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>"
				+ "<script type=\"text/javascript\">" + "google.charts.load('current', {'packages':['corechart']});"
				+ " google.charts.setOnLoadCallback(drawChart);" + "  function drawChart() {"
				+ " var data = google.visualization.arrayToDataTable([" + "    ['Task', 'Hours per Day'],"
				+ "   ['Work',     11]," + "    ['Eat',      2]," + "   ['Commute',  2]," + "   ['Watch TV', 2],"
				+ "   ['Sleep',    7]" + " ]);" + "var options = {" + " title: 'My Daily Activities'" + "};"
				+ "var chart = new google.visualization.PieChart(document.getElementById('piechart'));"
				+ "chart.draw(data, options);" + "}" + "</script>";

		// define a HTML String Builder
		htmlStringBuilder = new StringBuilder();

		// append html header and title
		htmlStringBuilder.append("<!DOCTYPE html><html lang=\"en\"><head><title>" + pageTitle + "</title>" + jq
				+ bootstrap + popupJS + chartJS + "</head>");

		// append body
		htmlStringBuilder.append("<body>" + "<div class=\"container\">"
				+ "<div class=\"container\" float:left style=\"display: inline-block\">" + "<h2>Test Report</h2>"
				+ "<p>*Report contains test case wise status</p>");

	}

	/* Summary table */
	public void createSummaryTable(String colHeader1, String colHeader2, String colHeader3) {

		// append table
		htmlStringBuilder.append("<table class=\"" + tableStyleClass + "\">");

		// append table header
		htmlStringBuilder.append(
				"<thead><tr><th>" + colHeader1 + "</th><th>" + colHeader2 + "</th><th>" + colHeader3 + "</th></tr>");
	}

	public void appendTableRow(String tcID, String tcName, String tcStatus) {

		// append table row
		htmlStringBuilder.append("<tr><td>" + tcID + "</td><td>" + tcName + "</td><td>" + tcStatus + "</td></tr>");

	}

	public void completeSummaryTable() {

		// close table
		htmlStringBuilder.append("</table>");
	}

	/* Create chart summary */

	public void createChartSummary() {

		htmlStringBuilder.append(
				"<div id=\"piechart\" class=\"container\" style=\"width: 900px; height: 500px; display: inline-block\" float:left></div>");
		// close summary table and chart div
		htmlStringBuilder.append("</div>");
	}

	/* Create testStepwise table */

	public void createTestStepTable(String testStep, String testStepName, String stepStatus, String startTime,
			String endTime, String Duration, String Screenshot) {

		// append table
		htmlStringBuilder.append("<div class=\"container\"><table class=\"" + tableStyleClass + "\">");

		// append table header
		htmlStringBuilder.append("<thead>" + "<tr><th>" + testStep + "</th><th>" + testStepName + "</th><th>"
				+ stepStatus + "</th><th>" + startTime + "</th><th>" + endTime + "</th><th>" + Duration + "</th><th>"
				+ Screenshot + "</th></tr>");
	}

	public void appendTestStepTableRow(String tcName, String testStepName, String stepStatus, Date startTime,
			Date endTime, File screenshot) {

		long duration = endTime.getTime() - startTime.getTime();

		// append table row
		htmlStringBuilder.append("<tr><td>" + tcName + "</td><td>" + testStepName + "</td><td>" + stepStatus
				+ "</td><td>" + startTime + "</td><td>" + endTime + "</td><td>" + duration + "</td><td><a href = \""
				+ screenshot + "\" onClick=\"return popup(this, 'notes')\">" + screenshot.getName() + "</a></td></tr>");

	}

	public void completeTestStepTable() {

		// close table
		htmlStringBuilder.append("</table></div>");
	}

	public void completeReport() {

		htmlStringBuilder.append("</body></html>");

		// write html string content to a file
		String fileName = "Report_" + new SimpleDateFormat("ddmmyyyy_hhmmss").format(new Date()) + ".html";
		// String fileName = "Report_"+ (int)Math.floor(Math.random() * 1001) +
		// ".html";
		try {
			WriteToFile(htmlStringBuilder.toString(), fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void WriteToFile(String fileContent, String fileName) throws IOException {
		String projectPath = "D:\\Manoj\\javaprojectsgit\\readwritedata\\reports";
		String tempFile = projectPath + File.separator + fileName;
		File file = new File(tempFile);
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

		// insert chart
		c.createChartSummary();

		// call during every method/step

		c.createTestStepTable("testCase", "testStepName", "stepStatus", "startTime", "endTime", "Duration",
				"Screenshot");

		File screenshot = new File("C:\\Users\\MANOJ\\Pictures\\Capture.jpg");

		c.appendTestStepTableRow("TC1", "1", "Passed", new Date(), new Date(), screenshot);

		// After suite in testng
		c.completeTestStepTable();

		c.completeReport();

	}

}

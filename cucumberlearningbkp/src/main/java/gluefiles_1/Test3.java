package gluefiles_1;

import java.util.List;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class Test3 {

	// declare data table as list
	@Given("^the following users exist$")
	public void the_following_users_exist(DataTable table) {
		
		//print table as in feature file
		System.out.println(table);

		//convert table to list of lists to read each value
		List<List<String>> tableList = table.raw();

		List<String> tableRow = tableList.get(0);

		String tableCell = tableRow.get(0);

		System.out.println(tableCell);

		// iterate through the datatable
		for (List<String> eachRow : tableList) {

			for (String eachCell : eachRow) {
				
				System.out.println(eachCell);
				

			}
		}
	}
}

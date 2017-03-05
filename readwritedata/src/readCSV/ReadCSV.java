package readCSV;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadCSV {

	String delimiter;

	@SuppressWarnings("unused")
	public void readCSVFile() throws IOException {

		String csvFile = "./Data/csvInput.csv";

		delimiter = "\\W"; //look for any non-word character (regex)

		String inputLine;

		String inputline;

		File csv = new File(csvFile);

		if (csv.exists()) {

			@SuppressWarnings("resource")
			FileReader csvReader = new FileReader(csv);

			@SuppressWarnings("resource")
			Scanner csvScanner = new Scanner(new File(csvFile));

			while (csvScanner.hasNextLine()) {

				inputLine = csvScanner.next();

				System.out.println("inputLine = " + inputLine);

				String[] splitString = inputLine.split(delimiter);

				int i = 0;

				while (i < splitString.length) {

					System.out.print(splitString[i] + "\t");

					i++;
				}

				System.out.println("");

			}

		}

		else {

			System.out.println("File doesn't exist");
		}
	}

	public static void main(String[] args) throws IOException {

		ReadCSV rc = new ReadCSV();

		rc.readCSVFile();

	}

}

package task01abstract;

import java.io.FileWriter;
import java.io.IOException;

public class PersonPrinterTxt extends PersonPrinter {

	@Override
	public void print(Person[] personArray, int consoleOption) throws IOException {
		FileWriter writer = new FileWriter("report.txt");
		writer.write(header);
		writer.write(divider);
		int count = 0;
		switch (consoleOption) {
		case 1:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i] != null) {
					writer.write(personArray[i].toString());
					count++;
				}
			}
			break;
		case 2:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i] != null && personArray[i] instanceof Student) {
					writer.write(personArray[i].toString());
					count++;
				}
			}
			break;
		case 3:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i] != null && !(personArray[i] instanceof Student)) {
					writer.write(personArray[i].toString());
					count++;
				}
			}
			break;
		}
		writer.write(divider);

		if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4) {
			personPlural = "Osobe";
		}
		writer.write(footer + count + " " + personPlural + "\n");
		writer.close();
		System.out.println("\nVas izvestaj je sacuvan u report.txt fajlu u folderu projekta.\n");
	}

}

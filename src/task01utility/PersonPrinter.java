package task01utility;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Util class consisting of methods to print a Person[]
 * 
 * @author petar
 */
public class PersonPrinter {

	private String header, divider, footer, personPlural, emptyArrayMsg;

	public PersonPrinter() {
		this.header = String.format("%-13s %-13s %-13s\n", "Firstname", "Lastname", "Indexnumber");
		this.divider = "=========================================\n";
		this.footer = "Ukupno prikazano: ";
		this.personPlural = "Osoba";
		this.emptyArrayMsg = "Niz osoba je prazan. Izvestaj nije moguc.\n"; // TODO potencijalno koristiti sa isEmpty metodom
	}

	/**
	 * Method for printing Person[] in console
	 * 
	 * @param personArray   array of Person to be printed
	 * @param consoleOption int user input option to pick which objects to print
	 */
	public void printToConsole(Person[] personArray, int consoleOption) {
		System.out.print(header);
		System.out.print(divider);
		int count = 0;
		switch (consoleOption) {
		case 1:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i] != null) {
					System.out.print(personArray[i].toString());
					count++;
				}
			}
			break;
		case 2:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i] != null && personArray[i] instanceof Student) {
					System.out.print(personArray[i].toString());
					count++;
				}
			}
			break;
		case 3:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i] != null && !(personArray[i] instanceof Student)) {
					System.out.print(personArray[i].toString());
					count++;
				}
			}
			break;
		}
		System.out.print(divider);
		if (count % 10 == 2 || count % 10 == 3 || count % 10 == 4) {
			personPlural = "Osobe";
		}
		System.out.print(footer + count + " " + personPlural + "\n");
	}

	/**
	 * Method for printing Person[] in .txt file in Eclipse project folder
	 * 
	 * @param personArray   array of Person to be printed
	 * @param consoleOption int user input option to pick which objects to print
	 * @throws IOException
	 */
	public void printToTextFile(Person[] personArray, int consoleOption) throws IOException {
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
		System.out.println("\nVas izvestaj je sacuvan u report.txt fajlu u folderu projekta.");
	}

	// TODO trenutno nekoriscen metod koji proverava da li je niz prazan, potencijalno da se doda
	static boolean isEmpty(Person[] personArray) {
		for (int i = 0; i < personArray.length; i++) {
			if (personArray[i] != null) {
				return false;
			}
		}
		return true;
	}

}

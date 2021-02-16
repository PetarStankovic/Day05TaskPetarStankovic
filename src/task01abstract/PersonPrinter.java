package task01abstract;

public abstract class PersonPrinter {

	protected String header, divider, footer, personPlural;

	public PersonPrinter() {
		this.header = String.format("%-13s %-13s %-13s\n", "Firstname", "Lastname", "Indexnumber");
		this.divider = "=========================================\n";
		this.footer = "Ukupno prikazano: ";
		this.personPlural = "Osoba";
	}

	public abstract void print(Person[] personArray, int consoleOption) throws Exception;

}

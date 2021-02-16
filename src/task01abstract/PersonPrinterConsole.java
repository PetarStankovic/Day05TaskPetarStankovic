package task01abstract;

public class PersonPrinterConsole extends PersonPrinter {

	@Override
	public void print(Person[] personArray, int consoleOption) {
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
}

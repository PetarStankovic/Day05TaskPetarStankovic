package task01abstract;

import java.util.Scanner;

public class Task0102PetarStankovic {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("Mile", "Milic");
		Person p2 = new Person("Zika", "Zikic");
		Student s1 = new Student("Gvido", "Gvidic", 202713, 2015);
		Student s2 = new Student("Maja", "Majic", 202714, 2014);
		Student s3 = new Student("Marko", "Markovic", 322714, 2020);

		Person[] personArray1 = { p1, p2, s1, s2, s3 };
//		Person[] personArray2 = { p1, p2, null, s2, s3 };
//		Person[] personArray3 = new Person[5];
//		Person[] personArray4 = { s1, s2, s3 };
//		Person[] personArray5 = { p1, p2 };

		Scanner sc = new Scanner(System.in);
		int consoleOption = 0;
		do {
			System.out.print("Ukucajte komandu: \n1 - Sve osobe \n2 - Svi studenti \n3 - Svi koji nisu studenti\n->");
			consoleOption = sc.nextInt();
		} while (consoleOption != 1 && consoleOption != 2 && consoleOption != 3);
		sc.close();
		System.out.println("Izabrali ste opciju " + consoleOption + "\n");

		PersonPrinter printer = new PersonPrinterTxt();
		printer.print(personArray1, consoleOption);

		printer = new PersonPrinterConsole();
		printer.print(personArray1, consoleOption);
	}
}

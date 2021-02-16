package task01utility;

import java.io.IOException;
import java.util.Scanner;

public class Task01PetarStankovic {

	public static void main(String[] args) throws IOException {

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
		int option = 0;
		do {
			System.out.print("Ukucajte komandu: \n1 - Sve osobe \n2 - Svi studenti \n3 - Svi koji nisu studenti\n->");
			option = sc.nextInt();
		} while (option != 1 && option != 2 && option != 3);
		sc.close();
		System.out.println("Izabrali ste opciju " + option + "\n");

		PersonPrinter printer = new PersonPrinter();

		printer.printToConsole(personArray1, option);
		printer.printToTextFile(personArray1, option);
	}

}

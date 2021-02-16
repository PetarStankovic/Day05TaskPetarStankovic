package task01utility;

public class Person {

	protected String firstName;
	protected String lastName;

	public Person(String firstname, String lastName) {
		this.firstName = firstname;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("%-13s %-13s\n", firstName, lastName);
	}

}

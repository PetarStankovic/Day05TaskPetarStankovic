package task01utility;

public class Student extends Person {

	private int indexNumber;
	private int indexYear;

	public Student(String firstname, String lastName, int indexNumber, int indexYear) {
		super(firstname, lastName);
		this.indexNumber = indexNumber;
		this.indexYear = indexYear;
	}

	@Override
	public String toString() {
		return String.format("%-13s %-13s %d/%d\n", firstName, lastName, indexYear, indexNumber);
	}

}

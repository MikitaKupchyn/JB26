package by.epam.lesson6.main;

public class Student {
	private String name;
	private String surname;
	private double[] marks;
	private int countOfMarks = 0;
	private double averageMark;

	public Student(String name, String surname, int numberOfMarks) {
		this.name = name;
		this.surname = surname;
		marks = new double[numberOfMarks];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountOfMarks() {
		return countOfMarks;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", averageMark=" + averageMark + "]";
	}

	public void setMark(int currentMark) {
		marks[countOfMarks] = currentMark;
		countOfMarks++;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public double getAvrMark() {
		double sumOfMarks = 0;
		for (int i = 0; i < marks.length; i++) {
			sumOfMarks = sumOfMarks + marks[i];
		}
		averageMark = sumOfMarks / countOfMarks;
		return averageMark;
	}


}

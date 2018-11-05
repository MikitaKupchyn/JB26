package by.epam.lesson6.main;

public class Group {
	
	private Student[] students;
	private double averageMarkOfGroup;
	private int sizeOfGroup = 0;

	public Group(int sizeOfGroup) {
		students = new Student[sizeOfGroup];
	}

	public void add(Student student) {
		students[sizeOfGroup] = student;
		sizeOfGroup++;
	}

	public double getAverageMarkOfGroup() {
		int sumOfAverageMarkOfStudents = 0;
		for (int i = 0; i < students.length; i++) {
			sumOfAverageMarkOfStudents += students[i].getAvrMark();
		}
		averageMarkOfGroup = sumOfAverageMarkOfStudents / sizeOfGroup;
		return averageMarkOfGroup;
	}

	public void printAllStudent() {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}

}

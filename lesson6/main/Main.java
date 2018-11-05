package by.epam.lesson6.main;

public class Main {
	public static void main(String[] args) {

		Group group1 = new Group(3);

		Student one = new Student("Mark", "Mark", 2);
		Student two = new Student("Bob", "Bob", 2);
		Student three = new Student("Todd", "Todd", 2);
		Student four = new Student("Alex", "Alex", 2);
		Student five = new Student("Odin", "Odin", 2);

		one.setMark(4);
		one.setMark(2);

		two.setMark(3);
		two.setMark(3);

		three.setMark(2);
		three.setMark(5);

		four.setMark(5);
		four.setMark(5);

		five.setMark(4);
		five.setMark(4);

		group1.add(one);
		group1.add(two);
		group1.add(three);

		Group group2 = new Group(2);

		group2.add(four);
		group2.add(four);

		System.out.println("Average Mark of Group 1: " + group1.getAverageMarkOfGroup());
		System.out.println("Average Mark of Each Student: ");
		group1.printAllStudent();

		System.out.println("Average Mark of Group 2: " + group2.getAverageMarkOfGroup());
		System.out.println("Average Mark of Each Student: ");
		group2.printAllStudent();

	}

}

package Lesson9;

	import java.util.ArrayList;

	public class Main {

		private static ArrayList<Book> list;

		public static void main(String[] args) {
			createLibrary();
			printLibrary();
		}

		public static void createLibrary() {

			Book book1 = new ProgrammerBook("Thinking in Java", 1998, " Bruce Eckel ", "High");
			Book book2 = new FantasticBook("Fahrenheit 451", 1953, "Ray Bradbury", "Dystopian");
			Book book3 = new ArtisticBook("Bel Ami", 1885, "Guy de Maupassant", "High");

			list = new ArrayList<>();
			list.add(book1);
			list.add(book2);
			list.add(book3);

		}

		public static void printLibrary() {

			for (Book listOfBooks : list) {
				System.out.println(listOfBooks.toString());
			}
		}

	}

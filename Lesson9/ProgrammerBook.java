package Lesson9;

public class ProgrammerBook extends Book {

	private String level;

	public ProgrammerBook(String title, int publishYear, String author, String level) {
		super(title, publishYear, author);
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}

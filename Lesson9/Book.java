package Lesson9;

public class Book {
	private String title;
	private int publishYear;
	private String author;

	public Book(String title, int publishYear, String author) {
		this.title = title;
		this.publishYear = publishYear;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", publishYear=" + publishYear + ", author=" + author + "]";
	}

}

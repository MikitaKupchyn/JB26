package Lesson9;

public class FantasticBook extends Book{
	
	private String genre;

	public FantasticBook(String title, int publishYear, String author, String genre) {
		super(title, publishYear, author);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
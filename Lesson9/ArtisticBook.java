package Lesson9;

public class ArtisticBook extends Book{
	
	private String readability;

	public ArtisticBook(String title, int publishYear, String author, String readability) {
		super(title, publishYear, author);
		this.readability = readability;
	}

	public String getReadability() {
		return readability;
	}

	public void setReadability(String readability) {
		this.readability = readability;
	}
}
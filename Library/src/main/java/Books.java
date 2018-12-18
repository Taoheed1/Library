
public class Books extends Items implements Update {

	private String genre;
	private String author;

	public Books(String itemTitle, String returnDate, String currentOwner, boolean available) {
		super(itemTitle, returnDate, currentOwner, available);
		this.genre = genre;
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setBookTitle(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}


public class Newspapers extends Items {

	private String newspaperType;

	public Newspapers(String itemTitle, String returnDate, String currentOwner, boolean available) {
		super(itemTitle, returnDate, currentOwner, available);
		this.newspaperType = newspaperType;
	}

	public String getNewspaperType() {
		return newspaperType;
	}

	public void setNewspaperType(String newspaperType) {
		this.newspaperType = newspaperType;
	}

}

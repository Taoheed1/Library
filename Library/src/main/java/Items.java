import java.util.ArrayList;

public abstract class Items implements Update {

	private String itemTitle;
	private String returnDate;
	private String currentOwner;
	private boolean available;

	ArrayList<Items> libraryItems = new ArrayList<Items>();

	public Items(String itemTitle, String returnDate, String currentOwner, boolean available) {
		this.itemTitle = itemTitle;
		this.returnDate = returnDate;
		this.currentOwner = currentOwner;
		this.available = available;
	}

  

	public boolean updateItem(String searchName) {
		boolean available = false;
		for (Items libraryPublications : libraryItems) {
			if (libraryPublications.getItemTitle().equals(searchName)) {
				available = true;
			}
		}
		return available;

	}

	// getters and setters
	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getCurrentOwner() {
		return currentOwner;
	}

	public void setCurrentOwner(String currentOwner) {
		this.currentOwner = currentOwner;
	}

	public ArrayList<Items> getLibraryItems() {
		return libraryItems;
	}

	public void setLibraryItems(ArrayList<Items> libraryItems) {
		this.libraryItems = libraryItems;
	}

	public boolean checkOut(boolean checkOutStatus) {
		return checkOutStatus;
	}

	public boolean checkIn(boolean checkInStatus) {
		return checkInStatus;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}

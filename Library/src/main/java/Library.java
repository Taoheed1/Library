import java.util.ArrayList;

public class Library {
	
	
	ArrayList<Items> libraryDocs = new ArrayList<Items>();
	//Items requestedItem = new Items();
	
//	Books book = new Books(false, 0, 7);
//	Dissertations dissertations = new Dissertations(false, 0, 7);
//	Newspapers newspapers = new Newspapers(false, 0, 7);
	
	
	
	ArrayList<Items> libraryItems = new ArrayList<Items>();
	
	
	public boolean checkOut(Items item) {
		boolean available = true;
		if (libraryItems.contains(item)) {
		 available=false;
		}
		return available;
	}
	
	public boolean checkIn(Items item) {
		boolean available=false;
		if (!libraryItems.contains(item)) {
			available=true;
		}
		return available;
	}
	
	public boolean addItem(Items addedItem) {
		libraryItems.add(addedItem);
		return libraryItems.contains(addedItem);
	}
	
	
	public boolean removeItem(Items removedItem) {
		libraryItems.remove(removedItem);
		return libraryItems.contains(removedItem);
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
	
	
}

import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTest {

	Items book = new Books("The Golden Compass", "Jeff", "06 January 2018", true);
	Items dissertation = new Dissertations("An in depth analysis of a piece of shit", "Stewart Dent",
			"18 December 2017", false);
	Items newspaper = new Newspapers("The Daily Mail", "31 March 2012", "Newspaper reader", true);
	Library library = new Library();

	@Test
	public void testCheckOutTrue() {
		assertTrue(library.checkOut(book));
		assertTrue(library.checkOut(dissertation));
		assertTrue(library.checkOut(newspaper));
	}

	@Test
	public void testCheckInTrue() {
		assertTrue(library.checkIn(book));
		assertTrue(library.checkIn(dissertation));
		assertTrue(library.checkIn(newspaper));
	}

	@Test
	public void testCheckOutFalse() {
		assertTrue(library.checkOut(book));
		assertTrue(library.checkOut(dissertation));
		assertTrue(library.checkOut(newspaper));
	}

	@Test
	public void testCheckInFalse() {
		assertTrue(library.checkIn(book));
		assertTrue(library.checkIn(dissertation));
		assertTrue(library.checkIn(newspaper));
	}

	@Test
	public void testAddItem() {
		assertEquals(true, library.addItem(book));
		assertEquals(true, library.addItem(dissertation));
		assertEquals(true, library.addItem(newspaper));
	}

	@Test
	public void testRemoveItem() {
		assertEquals(false, library.removeItem(book));
		assertEquals(false, library.removeItem(dissertation));
		assertEquals(false, library.removeItem(newspaper));
	}

	@Test
	public void testUpdateItemNameNull() {
		assertEquals(false, book.updateItem(null));
	}

	@Test
	public void testUpdateItemByName() {
		assertEquals(false, book.updateItem("The Golden Compass"));
	}

}

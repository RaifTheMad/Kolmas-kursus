package defaulto;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTesting {

	App ap = new App();

	@Test
	public void startsWithCapitalLetter() {
		assertTrue(ap.firstCapital("Onu"));
		assertFalse(ap.firstCapital("uno"));
	}

	@Test
	public void hasMoreUppercaseLetters() {
		assertTrue(ap.moreUpperCase("M‰DAKasKaR"));
		assertFalse(ap.moreUpperCase("DOTAislife"));
	}
	@Test
	public void numberEqualsStringRepresentation() {
		assertTrue(ap.stringEqualsInt("kolm", 3));
		assertFalse(ap.stringEqualsInt("kuus", 2));
		
	}

}

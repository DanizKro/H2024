package Uke34.oppg3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTest {

	
	@Test
	void inneholder() {
		
		ADTintervall intervall1 = new Intervall(5,10);
		ADTintervall intervall2 = new Intervall(9,12);
		ADTintervall intervall3 = new Intervall(13,15);
		
		assertTrue(intervall1.inneholder(5));
		assertFalse(intervall1.inneholder(4));
		assertFalse(intervall1.inneholder(11));
	}
	
	@Test
    void testUgyldigIntervall() {
        assertThrows(IllegalArgumentException.class, () -> { ADTintervall intervall = new Intervall(6, 5); // bruker lambda
        });
    }
	
	@Test
	void overlapper() {
		
		ADTintervall intervall1 = new Intervall(5,10);
		ADTintervall intervall2 = new Intervall(9,12);
		ADTintervall intervall3 = new Intervall(13,15);
		
		assertTrue(intervall1.overlapper(intervall2));
		assertFalse(intervall1.overlapper(intervall3));
	}
}

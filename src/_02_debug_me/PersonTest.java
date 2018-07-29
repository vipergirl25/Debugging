package _02_debug_me;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		Person ddlovato = new Person("Demi Lovato", 25);
		assertEquals("Demi Lovato", ddlovato.getName());
		assertEquals(25, ddlovato.getAge());
	}

}

package example.app.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleUtilsTest {

	@Test
	public void tos() {
		assertEquals("1", ExampleUtils.tos(1));
	}
}

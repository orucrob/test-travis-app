package eu.itinn.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private App app;

	@Before
	public void init() {
		app = new App();
	}

	@Test
	public void echoTest() {

		String testString = "Anything";
		String resutl = app.echo(testString);

		assertEquals(testString, resutl);

	}

}

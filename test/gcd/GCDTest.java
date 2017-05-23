package gcd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GCDTest {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "simple case", 6, 3, 3 }, { "simple case rev", 3, 6, 3 },
				{ "relatively prime", 10, 6, 1 }, { "relatively prime rev", 6, 10, 1 },
				{"zero", 11,0,0},{"zero rev", 0,11,0},
				// examples from
				// http://cs.au.dk/~chili/PBI04/ExamplePrograms/gcd_function_test.py
				{ "trick case: a = b", 13, 13, 13 }, { "first argument is a prime", 37, 600, 1 },
				{ "one is multiplum of other", 20, 100, 20 }, { "straight case", 624129, 2061517, 18913 }

		});
	}

	@Test
	public void testGcd() {
		assertEquals(message, expected, sut.gcd(a, b));
	}

	// and the initialization boilerplate
	GCD sut = new GCD();
	String message;
	int a;
	int b;
	int expected;

	public GCDTest(String message, int a, int b, int gcd) {
		this.message = message;
		this.a = a;
		this.b = b;
		this.expected = gcd;
	}

}

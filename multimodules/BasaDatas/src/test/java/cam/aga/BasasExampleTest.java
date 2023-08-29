package cam.aga;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.utils.MySimpleTest;

class BasasExampleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		MySimpleTest my = new MySimpleTest();
		boolean actual = my.isOddTL(5);
		assertTrue(actual);
		
	}

}

package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.Test;

class MainClassTest {
	@Test
	void testCheckKaprekarNumber() throws Exception {
		// Test will pass
		Number number1 = new Number(45);
		yakshaAssert(currentTest(), (KaprekarNumber.checkKaprekarNumber(number1) == 1 ? "true" : "false"),
				businessTestFile);
	}
}

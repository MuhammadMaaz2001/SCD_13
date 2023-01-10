package lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase {

	@Test
	void test() {
		count c = new count();
		int ab = c.countA("QaimAhmed");
		//assertEquals(2,ab);
		assertEquals(3,ab);
	}

}

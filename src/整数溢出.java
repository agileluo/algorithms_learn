

import static org.junit.Assert.*;

import org.junit.Test;

public class ������� {
	@Test
	public void test(){
		int i = -2147483648;
		assertEquals(i, Math.abs(i));
	}
}

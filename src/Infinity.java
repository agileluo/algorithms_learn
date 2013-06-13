

import static org.junit.Assert.*;

import org.junit.Test;

public class Infinity {
	public static void main(String[] args) {
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println((0 + 15) / 2);
	}
	
	@Test
	public void testDivideZero(){
		System.out.println(1/0.0);
		
	}
}

import static org.junit.Assert.*;
import org.junit.Test;

public class HW02Test {

	@Test
	public void testGetSumOfNumbers_SimpleString_Calculated() {
		int actual = HW02.getSumOfNumbers("12 some text 3  7");
		int expected = 22;
		assertEquals(actual, expected);
	}

	@Test
	public void testGetSumOfNumbers_SimpleString2_Calculated() {
		int actual = HW02.getSumOfNumbers("1 2 3 aa1a 3");
		int expected = 10;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testSortIgnoringSpaces_SimpleArray_Calculated() {
		String[] actual = {"a", " c", "b"};
		HW02.sortIgnoringSpaces(actual);
		String[] expected = {"a", "b", " c"};
		assertArrayEquals(actual, expected);
		
	}
	
}
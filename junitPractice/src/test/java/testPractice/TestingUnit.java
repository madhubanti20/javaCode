package testPractice;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.hasItem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junitPractice.TestUtils;

public class TestingUnit {
	
	TestUtils utils;
	Scanner sc;
	
	@Before  
	public void setUp() {
		utils = new TestUtils();
		sc = new Scanner(System.in);
	}
	
	
	@Test
	public void assertEqualsAddition() {
		System.out.println("Testing add");
		System.out.println("first number: ");
		int x = sc.nextInt();
		System.out.println("Second number: ");
		int y = sc.nextInt();
		int result = utils.add(x,y);
		assertEquals(x+y,result);
//		assertNotEquals(12, result);
//		assertTrue(true);
	}
	
	@Test
	public void assertSortedList() {
		List<Integer> input = Arrays.asList(1,3,2,5,4);
		List<Integer> expected = Arrays.asList(1,2,3,4,5);
		List<Integer> actual = utils.sortList(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkSortedList() {
		List<Integer> actual = Arrays.asList(1,3,2,5,4);
		List<Integer> expected = Arrays.asList(1,3,2,5,4);
		assertEquals(expected, actual);
	}
	
//	@Test
	@Ignore
	public void assertCheck() {

		List<Integer> data = Arrays.asList(1,2,3,4);
		List list = utils.returnList(data);
		for(Object o : list) {
//			assertTrue(o instanceof Integer);
			Integer i =(Integer)o;
			assertTrue(i % 2 == 0);
		}
	}
	
	@Test
	public void checkEqualArray() {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		assertArrayEquals(arr1, arr2);
		
	}
	
	@Test
	public void checkException() {
		assertThrows(ArithmeticException.class,()->{
			utils.div(10, 0);
		});
	}
	
	@Test
	public void checkNull() {
		assertNull(utils.returnString("Demo"));
	}
	
	@Test
	public void checkNotNull() {
		assertNotNull(utils.returnString("Hello"));
	}
	
	@Test
	public void checkSame() {
	    List<Integer> input = Arrays.asList(5, 8, 3, 4, 2, 9);
	    List<Integer> output = utils.checkSameListAfterModifying(input);
	    assertSame(output, input);
	}
	
	@Test
	public void checkNotSame() {
	    List<Integer> input = Arrays.asList(5, 8, 3, 4, 2, 9);
	    List<Integer> output = new ArrayList(utils.checkSameListAfterModifying(input));
	    assertNotSame(output, input);
	}
	
	@Test
	public void checkMatchersInList() {
	    List<String> input = Arrays.asList("tom", "jerry", "spike");
	    List<String> output = utils.checkMatchers(input);

	    assertThat(output, hasItem("TOM"));
	    assertThat(output, hasItems("TOM","JERRY","SPIKE"));

	  }

	
	@After
	public void closeResource() {
		this.utils = null;
	}
	
	
}

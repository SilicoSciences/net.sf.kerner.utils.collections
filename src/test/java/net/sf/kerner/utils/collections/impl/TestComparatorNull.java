package net.sf.kerner.utils.collections.impl;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestComparatorNull {
	
	private ComparatorNull<Integer> c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new ComparatorNull<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCompare01() {
		assertEquals(0, c.compare(null, null));
	}
	
	@Test
	public final void testCompare02() {
		assertEquals(-1, c.compare(null, Integer.valueOf(2)));
	}
	
	@Test
	public final void testCompare03() {
		assertEquals(1, c.compare(Integer.valueOf(2), null));
	}
	
	@Test
	public final void testCompare04() {
		assertEquals(0, c.compare(Integer.valueOf(2), Integer.valueOf(2)));
	}
	
	@Test(expected=ClassCastException.class)
	public final void testCompare05() {
		ComparatorNull<Object> c = new ComparatorNull<Object>();
		assertEquals(0, c.compare(new Object(), Integer.valueOf(2)));
	}
	
	@Test(expected=ClassCastException.class)
	public final void testCompare06() {
		ComparatorNull<Object> c = new ComparatorNull<Object>();
		assertEquals(0, c.compare(Integer.valueOf(2), new Object()));
	}

}

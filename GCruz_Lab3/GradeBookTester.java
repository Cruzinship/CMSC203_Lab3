import static org.junit.Assert.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class GradeBookTester{
	
	
	private GradeBook gradeBook1;
	private GradeBook gradeBook2;

	@Before
	public void setUp(){
		gradeBook1 = new GradeBook(3);
		gradeBook2 = new GradeBook(3);

		gradeBook1.addScore(20);
		gradeBook1.addScore(15.35);
		gradeBook1.addScore(79.4);

		gradeBook2.addScore(18.4);
		gradeBook2.addScore(50.3);
		gradeBook2.addScore(32.5);
	}

	@After
	public void tearDown(){
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	public void testAddScore() {
		 assertEquals("20.0 15.35 79.4", gradeBook1.toString());
		 assertEquals("18.4 50.3 32.5", gradeBook2.toString());
		 assertEquals(3, gradeBook1.getScoreSize());
		 assertEquals(3, gradeBook2.getScoreSize());
	}

	@Test
	public void testSum() {
		assertEquals(114.75, gradeBook1.sum(), .01);
		assertEquals(101.2, gradeBook2.sum(), .1);
	}

	@Test
	public void testMinimum() {
		assertEquals(15.35, gradeBook1.minimum(), .01);
		assertEquals(18.4, gradeBook2.minimum(), .1);
	}

	@Test
	public void testFinalScore() {
		assertEquals(99.4, gradeBook1.finalScore(), .1);
		assertEquals(82.8, gradeBook2.finalScore(), .1);
	}
	@Test
	public void testToString() {
	    assertEquals("20.0 15.35 79.4", gradeBook1.toString());
	    assertEquals("18.4 50.3 32.5", gradeBook2.toString());
	}

	@Test
	public void testGetScoreSize() {
	    assertEquals(3, gradeBook1.getScoreSize());
	    assertEquals(3, gradeBook2.getScoreSize());
	}
}

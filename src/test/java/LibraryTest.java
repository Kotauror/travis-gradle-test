/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import mylib.Library;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void addsIntegers() {
        Library classUnderTest = new Library();
        assertEquals(4, classUnderTest.addIntegers(2, 2));
    }
}

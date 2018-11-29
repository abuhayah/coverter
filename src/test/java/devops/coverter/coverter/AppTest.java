package devops.coverter.coverter;

import devops.coverter.coverter.App;
import devops.coverter.coverter.NumberWords;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private App app ;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        app = new App() ;
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    

	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", app.toWords( -1 ) ) ;
	}
	




	public void test1() {

	int input = 1;

	String output = app.convert(input);

	Assert.assertEquals("One", output);

	}




	public void test20() {

	int input = 20;

	String output = app.convert(input);

	Assert.assertEquals("Twenty", output);

	}




	public void test99() {

	int input = 99;

	String output = app.convert(input);

	Assert.assertEquals("Ninety Nine", output);

	}



	public void test256() {
	    int input = 256;
	    String output = app.convert(input);
	    Assert.assertEquals("two Hundred Fifty Six", output);
	} 
    
}

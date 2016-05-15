package se.iths.Arabic2Roman;

import junit.framework.Assert;
import junit.framework.TestCase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 
 * @author Yu Wang
 *	2016 - 05- 15
 *  ECP(Equvianlence Class Testing)--ekvivalensklassindelning, black-box testing
 *  BV: boundary value testing---gränsvärde, white-box testing
 */
public class AppTest{
	App app;
	String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	
	@Rule
	  public final ExpectedException exception = ExpectedException.none();
	
	@Before
	public void init(){
		app = new App(); 
	}
	
	@Test  //positive, valid ECP 
	public void testLessECP2(){
		Assert.assertEquals("II", app.arabicConvertRoman1000(2));
	}

	@Test  //positive, valid ECP
	public void test_ECP_8(){
		Assert.assertEquals("VIII", app.arabicConvertRoman1000(8));
	}

	@Test  //positive, valid ECP
	public void test_ECP_888(){
		Assert.assertEquals("DCCCLXXXVIII", app.arabicConvertRoman1000(888));
	}

	@Test //positive, valid ECP 
	public void test_ECP_911(){
		Assert.assertEquals("CMXI", app.arabicConvertRoman1000(911));
	}
	
	@Test  //BV
	public void test_BV__1(){
		Assert.assertEquals("I", app.arabicConvertRoman1000(1));
	}

	public void test_BV_10(){
		Assert.assertEquals("X", app.arabicConvertRoman1000(10));
	}
	
	@Test  
	public void test_BV_19(){
		Assert.assertEquals("XIX", app.arabicConvertRoman1000(19));
	}
	
	@Test  
	public void test_BV_20(){
		Assert.assertEquals("XX", app.arabicConvertRoman1000(20));
	}
	
	@Test  
	public void test_BV_31(){
		Assert.assertEquals("XXXI", app.arabicConvertRoman1000(31));
	}
	
	@Test  
	public void test_BV_91(){
		Assert.assertEquals("XCI", app.arabicConvertRoman1000(91));
	}	
	@Test  
	public void test_BV_100(){
		Assert.assertEquals("C", app.arabicConvertRoman1000(100));
	}
	
	@Test //negative, invalid ECP
	public void negTestLess10(){
		assertFalse(("II").equals(app.arabicConvertRoman1000(1)));		
	}

	@Test //exception handling testing 
	public void negTestLess1(){
		exception.expect(NumberFormatException.class);
	    equals(app.arabicConvertRoman1000(0));		
	}

}

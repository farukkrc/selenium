package myTest;


import static org.junit.Assert.*;


import org.junit.Test;



public class JunitAssert {
	
	@Test
	public void testMethod(){
		SeleniumGetHtml selenium = new SeleniumGetHtml();
		
		assertEquals(selenium.htmlData, HtmlData.data);
	}
}

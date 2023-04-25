package com.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
     @Test
     public void testadd() {
    	 App a1=new App();
    	 int exp=5;
    	 int res=a1.add(2, 3);
    	 assertEquals(exp,res);
     }
     
     @Test
     public void testsub() {
    	 App a1=new App();
    	 int exp=1;
    	 int res=a1.sub(2,  3);
    	 assertEquals(exp,res);
    	 
     }
     
     @Test
     public void testmul() {
     App a1=new App();
     int exp=6;
     int res=a1.mul(2,  3);
     assertEquals(exp,res);
     
     }
     
     
     @Test
     public void testdiv() {
    	 App a1=new App();
    	 int exp=1.5;
    	 int res=a1.div(2,  3);
    	 assertEquals(exp,res);
     }
     
    			 
     }


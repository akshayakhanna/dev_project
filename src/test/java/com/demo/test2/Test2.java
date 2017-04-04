package com.demo.test2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;



public class Test2  {
	
	@Test
    public void testMethodOne(){
        Assert.assertTrue(true);
    }
	  
	@Ignore
    @Test
    public void testMethodTwo(){
	Assert.assertTrue(true);
    }
	  
    @Test
        public void testMethodThree(){
        Assert.assertTrue(true);
    }

}

package com.thuong;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {
    
    @Test
    public void testAdd() {
    	App o=new App();
    	int x=10;
    	int y=20;
    	int actualResult=o.add(x, y);
    	int expected=30;
    	Assert.assertEquals(expected,actualResult);
    }
}

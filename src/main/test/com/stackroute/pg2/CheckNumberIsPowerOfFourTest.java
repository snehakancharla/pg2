package com.stackroute.pg2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberIsPowerOfFourTest {

    CheckNumberIsPowerOfFour checkNumberIsPowerOfFour;
    String result;

    @Before
    public void setUp() throws Exception {
        checkNumberIsPowerOfFour=new CheckNumberIsPowerOfFour();

    }

    @After
    public void tearDown() throws Exception {
        checkNumberIsPowerOfFour=null;
    }

    @Test
    public void testCheckNumberIsPowerOfFourTrue() {

        //Act
        result=checkNumberIsPowerOfFour.isPowerOfFour(64);
        //Assert
        assertEquals("is a power of 4",result);

    }
    @Test
    public void testCheckNumberIsPowerOfFourFalse() {

        //Act
        result=checkNumberIsPowerOfFour.isPowerOfFour(65);
        //Assert
        assertEquals("is not a power of 4",result);



    }
}
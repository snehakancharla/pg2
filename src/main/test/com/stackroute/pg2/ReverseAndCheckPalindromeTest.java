package com.stackroute.pg2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAndCheckPalindromeTest {
    ReverseAndCheckPalindrome numberHolder;
    String result;

    @Before
    public void setUp() throws Exception {
        numberHolder=new ReverseAndCheckPalindrome();
    }

    @After
    public void tearDown() throws Exception {
        numberHolder=null;
    }

    @Test
    public void testCheckPlaindromeTrue() {

        result=numberHolder.reverseString(88888);
        //Assert
        assertEquals("it is a palindrome",result);


    }
    @Test
    public void testCheckPlaindromeFalse() {

        result=numberHolder.reverseString(123);
        //Assert
        assertEquals("it is not a palindrome",result);


    }
}
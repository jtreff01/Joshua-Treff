package edu.tufts.sweclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StudentStringTest {

    private StudentStringInterface studentstring;

    @Before
    public void setUp() {
        studentstring = new StudentString();
    }

    @After
    public void tearDown() {
        studentstring = null;
    }

    /*
    * Testing the method countNum
    * */

    @Test
    public void countNumTest1() {
        studentstring.setString("-L3t'5 try t0 add 50me d161t5!!-");
        assertEquals(6, studentstring.countNum());
    }

    @Test
    public void countNumTest2() {
        
        fail("Requires Implementation");
    }

    @Test
    public void countNumTest3() {
        
        fail("Requires Implementation");
    }

    @Test
    public void countNumTest4() {
        
        fail("Requires Implementation");
    }

    @Test
    public void countNumTest5() {
        
        fail("Requires Implementation");
    }

    @Test
    public void countNumTest6() {
        
        fail("Requires Implementation");
    }

    @Test
    public void countNumTest7() {

        fail("Requires Implementation");
    }

    @Test
    public void countNumTest8() {

        fail("Requires Implementation");
    }

    /*
    * Testing the method rotateChar
    * */
	
    @Test
    public void rotateCharTest1() {
        studentstring.setString("I am taking the SW Engineering Class Fall 2018");
        assertEquals(" amItak ng ihe tW ESginnerieg CnasslFal  20l81", studentstring.rotateChar(4, false));
    }

    @Test
    public void rotateCharTest2() {
        studentstring.setString("I am taking the SW Engineering Class Fall 2018");
        assertEquals("mI ak ta ing theESW nngiieerCng slasl Fa0l 281", studentstring.rotateChar(4, true));
    }

    @Test
    public void rotateCharTest3() {
        
        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest4() {

        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest5() {

        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest6() {

        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest7() {
        
        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest8() {
        
        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest9() {
        
        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest10() {
        
        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest11() {
        
        fail("Requires Implementation");
    }

    @Test
    public void rotateCharTest12() {
        
        fail("Requires Implementation");
    }
}

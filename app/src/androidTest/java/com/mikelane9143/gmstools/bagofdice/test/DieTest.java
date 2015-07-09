package com.mikelane9143.gmstools.bagofdice.test;

import com.mikelane9143.gmstools.bagofdice.DiceMan.Die;

import junit.framework.TestCase;

/**
 * Created by TestDummy on 9/07/2015.
 */
public class DieTest extends TestCase {

    Die testDie;

    public void setUp() throws Exception {
        super.setUp();
        testDie = new Die(6);
    }

   /* public void tearDown() throws Exception {

    }*/

    public void testRoll() throws Exception {
        testDie.roll();
        int result = testDie.getResult();
        assertTrue(result > 0);
        assertTrue(result <= 6);
        //assertTrue(result);
    }

    /*public void testGetResult() throws Exception {

    }*/
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Pritchard
 */
public class doctorTest {
    
    public doctorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRating method, of class doctor.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        doctor instance = null;
        String expResult = "";
        String result = instance.getRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class doctor.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        String rating = "";
        doctor instance = null;
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfRates method, of class doctor.
     */
    @Test
    public void testGetNumberOfRates() {
        System.out.println("getNumberOfRates");
        doctor instance = null;
        String expResult = "";
        String result = instance.getNumberOfRates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfRates method, of class doctor.
     */
    @Test
    public void testSetNumberOfRates() {
        System.out.println("setNumberOfRates");
        String numberOfRates = "";
        doctor instance = null;
        instance.setNumberOfRates(numberOfRates);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytests;

import accounts.patient;
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
public class patientTest {
    
    public patientTest() {
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
     * Test of getAge method, of class patient.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        patient instance = null;
        String expResult = "";
        String result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class patient.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "";
        patient instance = null;
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class patient.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        patient instance = null;
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class patient.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        patient instance = null;
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

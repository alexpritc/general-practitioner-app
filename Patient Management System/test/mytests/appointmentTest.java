/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import other.appointment;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Pritchard
 */
public class appointmentTest {
    
    public appointmentTest() {
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
     * Test of getPatient method, of class appointment.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        appointment instance = null;
        String expResult = "";
        String result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient method, of class appointment.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        String patient = "";
        appointment instance = null;
        instance.setPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctor method, of class appointment.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        appointment instance = null;
        String expResult = "";
        String result = instance.getDoctor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctor method, of class appointment.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        String doctor = "";
        appointment instance = null;
        instance.setDoctor(doctor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        appointment instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class appointment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        appointment instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class appointment.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        appointment instance = null;
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class appointment.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        appointment instance = null;
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class appointment.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        appointment instance = null;
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class appointment.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        appointment instance = null;
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

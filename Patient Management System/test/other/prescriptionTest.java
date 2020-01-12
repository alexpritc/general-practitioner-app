/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

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
public class prescriptionTest {
    
    public prescriptionTest() {
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
     * Test of getQuantity method, of class prescription.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        prescription instance = null;
        String expResult = "";
        String result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class prescription.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        String quantity = "";
        prescription instance = null;
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientId method, of class prescription.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        prescription instance = null;
        String expResult = "";
        String result = instance.getPatientId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientId method, of class prescription.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        String patientId = "";
        prescription instance = null;
        instance.setPatientId(patientId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctorId method, of class prescription.
     */
    @Test
    public void testGetDoctorId() {
        System.out.println("getDoctorId");
        prescription instance = null;
        String expResult = "";
        String result = instance.getDoctorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctorId method, of class prescription.
     */
    @Test
    public void testSetDoctorId() {
        System.out.println("setDoctorId");
        String doctorId = "";
        prescription instance = null;
        instance.setDoctorId(doctorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicine method, of class prescription.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        prescription instance = null;
        String expResult = "";
        String result = instance.getMedicine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicine method, of class prescription.
     */
    @Test
    public void testSetMedicine() {
        System.out.println("setMedicine");
        String medicine = "";
        prescription instance = null;
        instance.setMedicine(medicine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentNotes method, of class prescription.
     */
    @Test
    public void testGetAppointmentNotes() {
        System.out.println("getAppointmentNotes");
        prescription instance = null;
        String expResult = "";
        String result = instance.getAppointmentNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppointmentNotes method, of class prescription.
     */
    @Test
    public void testSetAppointmentNotes() {
        System.out.println("setAppointmentNotes");
        String appointmentNotes = "";
        prescription instance = null;
        instance.setAppointmentNotes(appointmentNotes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

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
public class systemdatabaseTest {
    
    public systemdatabaseTest() {
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
     * Test of readPatients method, of class systemdatabase.
     */
    @Test
    public void testReadPatients() throws Exception {
        System.out.println("readPatients");
        systemdatabase.readPatients();
        // TODO review the generated test code and remove the default call to fail.
        fail("patients.txt doesn't exist.");
    }

    /**
     * Test of readAdministrators method, of class systemdatabase.
     */
    @Test
    public void testReadAdministrators() throws Exception {
        System.out.println("readAdministrators");
        systemdatabase.readAdministrators();
        // TODO review the generated test code and remove the default call to fail.
        fail("administrators.txt doesn't exist.");
    }

    /**
     * Test of readDoctors method, of class systemdatabase.
     */
    @Test
    public void testReadDoctors() throws Exception {
        System.out.println("readDoctors");
        systemdatabase.readDoctors();
        // TODO review the generated test code and remove the default call to fail.
        fail("doctors.txt doesn't exist.");
    }

    /**
     * Test of readSecretaries method, of class systemdatabase.
     */
    @Test
    public void testReadSecretaries() throws Exception {
        System.out.println("readSecretaries");
        systemdatabase.readSecretaries();
        // TODO review the generated test code and remove the default call to fail.
        fail("secretaries.txt doesn't exist.");
    }

    /**
     * Test of readPatientRequests method, of class systemdatabase.
     */
    @Test
    public void testReadPatientRequests() throws Exception {
        System.out.println("readPatientRequests");
        systemdatabase.readPatientRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("patient-requests.txt doesn't exist.");
    }

    /**
     * Test of readPatientRemovals method, of class systemdatabase.
     */
    @Test
    public void testReadPatientRemovals() throws Exception {
        System.out.println("readPatientRemovals");
        systemdatabase.readPatientRemovals();
        // TODO review the generated test code and remove the default call to fail.
        fail("patient-removals.txt doesn't exist.");
    }

    /**
     * Test of readFeedback method, of class systemdatabase.
     */
    @Test
    public void testReadFeedback() throws Exception {
        System.out.println("readFeedback");
        systemdatabase.readFeedback();
        // TODO review the generated test code and remove the default call to fail.
        fail("feedback.txt doesn't exist.");
    }

    /**
     * Test of readMessages method, of class systemdatabase.
     */
    @Test
    public void testReadMessages() throws Exception {
        System.out.println("readMessages");
        systemdatabase.readMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("messages.txt doesn't exist.");
    }

    /**
     * Test of readNotifications method, of class systemdatabase.
     */
    @Test
    public void testReadNotifications() throws Exception {
        System.out.println("readNotifications");
        systemdatabase.readNotifications();
        // TODO review the generated test code and remove the default call to fail.
        fail("notifications.txt doesn't exist.");
    }

    /**
     * Test of readMedicines method, of class systemdatabase.
     */
    @Test
    public void testReadMedicines() throws Exception {
        System.out.println("readMedicines");
        systemdatabase.readMedicines();
        // TODO review the generated test code and remove the default call to fail.
        fail("medicines.txt doesn't exist.");
    }

    /**
     * Test of readAppointments method, of class systemdatabase.
     */
    @Test
    public void testReadAppointments() throws Exception {
        System.out.println("readAppointments");
        systemdatabase.readAppointments();
        // TODO review the generated test code and remove the default call to fail.
        fail("appointments.txt doesn't exist.");
    }

    /**
     * Test of readPrescriptions method, of class systemdatabase.
     */
    @Test
    public void testReadPrescriptions() throws Exception {
        System.out.println("readPrescriptions");
        systemdatabase.readPrescriptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("prescriptions.txt doesn't exist.");
    }

    /**
     * Test of readAppointmentRequests method, of class systemdatabase.
     */
    @Test
    public void testReadAppointmentRequests() throws Exception {
        System.out.println("readAppointmentRequests");
        systemdatabase.readAppointmentRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("appointment-requests.txt doesn't exist.");
    }

    /**
     * Test of savePatients method, of class systemdatabase.
     */
    @Test
    public void testSavePatients() throws Exception {
        System.out.println("savePatients");
        systemdatabase.savePatients();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to file patients.txt.");
    }

    /**
     * Test of saveAdministrators method, of class systemdatabase.
     */
    @Test
    public void testSaveAdministrators() throws Exception {
        System.out.println("saveAdministrators");
        systemdatabase.saveAdministrators();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to file administrators.txt.");
    }

    /**
     * Test of saveDoctors method, of class systemdatabase.
     */
    @Test
    public void testSaveDoctors() throws Exception {
        System.out.println("saveDoctors");
        systemdatabase.saveDoctors();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to file doctors.txt.");
    }

    /**
     * Test of saveSecretaries method, of class systemdatabase.
     */
    @Test
    public void testSaveSecretaries() throws Exception {
        System.out.println("saveSecretaries");
        systemdatabase.saveSecretaries();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to secretaries.txt.");
    }

    /**
     * Test of savePatientRequests method, of class systemdatabase.
     */
    @Test
    public void testSavePatientRequests() throws Exception {
        System.out.println("savePatientRequests");
        systemdatabase.savePatientRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to patient-requests.txt.");
    }

    /**
     * Test of savePatientRemovals method, of class systemdatabase.
     */
    @Test
    public void testSavePatientRemovals() throws Exception {
        System.out.println("savePatientRemovals");
        systemdatabase.savePatientRemovals();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to patient-removals.txt.");
    }

    /**
     * Test of saveFeedback method, of class systemdatabase.
     */
    @Test
    public void testSaveFeedback() throws Exception {
        System.out.println("saveFeedback");
        String comment = "";
        systemdatabase.saveFeedback(comment);
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to feedback.txt.");
    }

    /**
     * Test of saveMessage method, of class systemdatabase.
     */
    @Test
    public void testSaveMessage() throws Exception {
        System.out.println("saveMessage");
        String message = "";
        systemdatabase.saveMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to messages.txt.");
    }

    /**
     * Test of saveNotifications method, of class systemdatabase.
     */
    @Test
    public void testSaveNotifications() throws Exception {
        System.out.println("saveNotifications");
        systemdatabase.saveNotifications();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to notifications.txt.");
    }

    /**
     * Test of saveMedicines method, of class systemdatabase.
     */
    @Test
    public void testSaveMedicines() throws Exception {
        System.out.println("saveMedicines");
        systemdatabase.saveMedicines();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to medicines.txt");
    }

    /**
     * Test of saveAppointments method, of class systemdatabase.
     */
    @Test
    public void testSaveAppointments() throws Exception {
        System.out.println("saveAppointments");
        systemdatabase.saveAppointments();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to appointments.txt");
    }

    /**
     * Test of savePrescriptions method, of class systemdatabase.
     */
    @Test
    public void testSavePrescriptions() throws Exception {
        System.out.println("savePrescriptions");
        systemdatabase.savePrescriptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to prescriptions.txt.");
    }

    /**
     * Test of saveAppointmentRequests method, of class systemdatabase.
     */
    @Test
    public void testSaveAppointmentRequests() throws Exception {
        System.out.println("saveAppointmentRequests");
        systemdatabase.saveAppointmentRequests();
        // TODO review the generated test code and remove the default call to fail.
        fail("Failed save to appointment-requests.txt.");
    }
    
}

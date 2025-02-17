package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;
import static java.lang.System.lineSeparator; // Import the lineSeparator() method

public class JobTest {

    @Test
    public void testJobConstructorSetsAllFields() {
        // Declare and initialize a new Job object with specified data
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Use assertTrue and assertEquals to test that the constructor correctly assigns fields
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Generate two Job objects with identical field values EXCEPT for id
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Test that equals returns false since id values differ
        assertFalse(job1.equals(job2));
    }

    // Add more test methods as needed for other tests related to the Job class

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = createJob("Web Developer", "LaunchCode", "StL", "Back-end developer", "Java");
        String firstChar = String.valueOf(job.toString().charAt(0));
        String lastChar = String.valueOf(job.toString().charAt(job.toString().length() - 1));
        assertEquals(firstChar, "\n");
        assertEquals(lastChar, "\n");
    }
    // Define a helper method to create a Job object with the given parameters
    private Job createJob(String name, String employer, String location, String positionType, String coreCompetency) {
        return new Job(name, new Employer(employer), new Location(location), new PositionType(positionType), new CoreCompetency(coreCompetency));
    }


    /*@Test
    private void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String expectedOutput = "\nID: " + job.getId() +
                "\nName: Product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence\n";

        assertEquals(expectedOutput, jobString);
    }*/

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();

        assertTrue(jobString.contains("ID: " + job.getId()));
        assertTrue(jobString.contains("Name: Product tester"));
        assertTrue(jobString.contains("Employer: ACME"));
        assertTrue(jobString.contains("Location: Desert"));
        assertTrue(jobString.contains("Position Type: Quality control"));
        assertTrue(jobString.contains("Core Competency: Persistence"));
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job emptyJob = new Job();
        String expectedOutput = "\nID: 5\nName: Data Not Available\nEmployer: Data Not Available\nLocation: Data Not Available\nPosition Type: Data Not Available\nCore Competency: Data Not Available\n";
        assertEquals(expectedOutput, emptyJob.toString());
    }
    @Test
    public void testSettingId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }


}
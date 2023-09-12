package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTaskFour extends AbstractTest {

    @Test
    public void testSettingJobIdExists() throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");

        try {
            jobTestClass.getMethod("testSettingId"); // Match the method name in JobTest
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testSettingId method");
        }
    }

    @Test
    public void testTestJobConstructorSetsAllFieldsExists() throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");

        try {
            jobTestClass.getMethod("testJobConstructorSetsAllFields");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testJobConstructorSetsAllFields method");
        }
    }

    @Test
    public void testTestJobsForEqualityExists() throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");

        try {
            jobTestClass.getMethod("testJobsForEquality");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testJobsForEquality method");
        }
    }
}

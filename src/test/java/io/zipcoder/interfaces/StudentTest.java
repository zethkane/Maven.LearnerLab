package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        Student student = new Student(0l, null);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(0l, null);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(0l, null);
        double hoursSpent = 32.0;
        student.learn(hoursSpent);
        double actual = student.getTotalStudyTime();
        double expected = hoursSpent;
        Assert.assertEquals(actual, expected);
    }
}

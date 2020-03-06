package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void  testImplementation(){
        Instructor instructor = new Instructor(0, null);
        Assert.assertTrue( instructor instanceof Teacher);
    }


    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(0, null);
        Assert.assertTrue(instructor instanceof  Person);
    }


    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(0, "Joe");
        Student student = new Student(1, "Jimmy");
        instructor.teach(student, 8);

        Double totalStudyTime = 8d;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(actual, totalStudyTime);
    }

    @Test
    public void testLecture(){}
}

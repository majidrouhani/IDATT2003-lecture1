package edu.ntnu.idatt2001.lectures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.ntnu.idatt2001.lectures.aggregation.PostalAddress;
import edu.ntnu.idatt2001.lectures.aggregation.StudentName;

/**
 * Unit test for simple App.
 */
public class AggregationTest 
{
    /**
     * Test create student
     */
    @Test
    public void createStudentTest()
    {

		StudentName name1 = new StudentName("Odd Even","Primtallet");

        assertEquals("Odd Even",name1.getFirstname());
        assertEquals("Primtallet",name1.getLastname());
    }

    /**
     * Test create postal address
     */
    @Test
    public void createPostalAddressTest()
    {

		PostalAddress postalAddress1 = new PostalAddress(7000,"Trondheim");

        assertEquals("Trondheim",postalAddress1.getAddress());
        assertEquals(7000,postalAddress1.getCode());
    }

}

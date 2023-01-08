package edu.ntnu.idatt2001.lectures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.ntnu.idatt2001.lectures.example1.utils.Address;
import edu.ntnu.idatt2001.lectures.example1.utils.Name;

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

		Name name1 = new Name("Odd Even","Primtallet");

        assertEquals("Odd Even",name1.getFirstname());
        assertEquals("Primtallet",name1.getLastname());
    }

    /**
     * Test create postal address
     */
    @Test
    public void createPostalAddressTest()
    {

		Address postalAddress1 = new Address(7000,"Trondheim");

        assertEquals("Trondheim",postalAddress1.getCity());
        assertEquals(7000,postalAddress1.getZipCode());
    }

}

package edu.ntnu.idatt2001.lectures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import edu.ntnu.idatt2001.lectures.aggregation.AppData;
import edu.ntnu.idatt2001.lectures.aggregation.Student;


/**
 * Unit test for simple App.
 */
public class HashMapTest 
{
    /**
     * Test create student
     */
    @Test
    public void createHashMapTest()
    {

        
		List<Student> data = new ArrayList<>();
		data = AppData.getData();

		HashMap<String,Student> studentHashmap = new HashMap<>();

		for (Student student:data) {
			studentHashmap.put(student.getUniqueIdasString(),student);
		}

        assertTrue(studentHashmap.containsKey("1998-03-15-DelFinito-Huppasahn-F"));

        assertFalse(studentHashmap.containsKey("1998-03-15-DelFinito-Huppasahn-M"));
        
    }

}

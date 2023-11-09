package edu.ntnu.idatt2001.lectures;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.ntnu.idatt2001.lectures.example1.aggregation.AppData;
import edu.ntnu.idatt2001.lectures.example1.aggregation.Student;

/**
 * Unit test for simple App.
 */
class HashMapTest {
    /**
     * Test create student
     */
    @Test
    void createHashMapTest() {

        List<Student> data = new ArrayList<>();
        data = AppData.getData();

        HashMap<String, Student> studentHashmap = new HashMap<>();

        for (Student student : data) {
            studentHashmap.put(student.getUniqueIdasString(), student);
        }

        assertTrue(studentHashmap.containsKey("1998-03-15-DelFinito-Huppasahn-F"));

        assertFalse(studentHashmap.containsKey("1998-03-15-DelFinito-Huppasahn-M"));

    }
}

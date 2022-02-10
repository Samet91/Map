package de.neuefische;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void shouldPushNewStudentInDB() {

        Student student = new Student(1, "Samet", "Uslu", 31);
        Map<Integer, Student> mapStudent = new HashMap<>();

        mapStudent.put(1, student);
        StudentDB studentDB = new StudentDB();
        studentDB.setMapOfStudents(mapStudent);

        assertEquals(1, studentDB.getMapOfStudents().size());

    }



}
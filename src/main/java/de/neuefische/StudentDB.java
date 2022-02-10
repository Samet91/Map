package de.neuefische;

import java.util.HashMap;
import java.util.Map;

public class StudentDB {

    private Map<String, Student> mapOfStudents = new HashMap();

    public StudentDB(Map<String, Student> mapOfStudents) {
        this.mapOfStudents = mapOfStudents;
    }


}

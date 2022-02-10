package de.neuefische;

import java.util.HashMap;
import java.util.Map;

public class StudentDB {

    private Map<Integer, Student> mapOfStudents = new HashMap();

    public StudentDB(Map<Integer, Student> mapOfStudents) {
        this.mapOfStudents = mapOfStudents;
    }

    public StudentDB () {

    }

    public Map<Integer, Student> getMapOfStudents() {
        return mapOfStudents;
    }

    public void setMapOfStudents(Map<Integer, Student> mapOfStudents) {
        this.mapOfStudents = mapOfStudents;
    }
}

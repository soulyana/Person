package me.soulyana;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> coursesTakenArrayList;

    public Student() {
        coursesTakenArrayList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCoursesTakenArrayList() {
        return coursesTakenArrayList;
    }

    public void setCoursesTakenArrayList(ArrayList<Course> coursesTakenArrayList) {
        this.coursesTakenArrayList = coursesTakenArrayList;
    }

    public void addCourse(Course aCourse) {
        coursesTakenArrayList.add(aCourse);
    }
}

package me.soulyana;

import java.util.ArrayList;

public class Teacher extends Person {
    //private String coursesTaught;
    private ArrayList<Course> coursesTaughtArrayList;

    public Teacher(){
        coursesTaughtArrayList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCoursesTaughtArrayList() {
        return coursesTaughtArrayList;
    }

    public void setCoursesTaughtArrayList(ArrayList<Course> coursesTaughtArrayList) {
        this.coursesTaughtArrayList = coursesTaughtArrayList;
    }

    public void addCourse(Course aCourse) {
        coursesTaughtArrayList.add(aCourse);
    }
}

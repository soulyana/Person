package me.soulyana;

public class Course {
    private String courseID;
    private String name;
    private String description;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseIDIn) {
        this.courseID = courseIDIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

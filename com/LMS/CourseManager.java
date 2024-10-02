package com.LMS;
import com.LMS.*;
import java.util.ArrayList;
public class CourseManager {
    private ArrayList<cource> courses;
    public CourseManager() {
        courses = new ArrayList<>();
    }
    //get course
    public ArrayList<cource> getCourses() {
        return courses;
    }
    public void addCourse(cource course) {
        courses.add(course);
    }
    public ArrayList<String> getCourseNamesAndIDs() {
        ArrayList<String> namesAndIDs = new ArrayList<>();
        for (cource course : courses) {
            String nameAndID = "Name: " + course.getName() + ", ID: " + course.getCode();
            namesAndIDs.add(nameAndID);
        }
        return namesAndIDs;
    }
    public void removeCourse(cource course) {
        courses.remove(course);
    }
    public cource getCourseByID(String id) {
        for (cource course : courses) {
            if (course.getCode().equals(id)) {
                return course;
            }
        }
        return null;
    }

}

package com.LMS;
import  java.util.*;
import java.util.ArrayList;

class cource{
        private String Name;
        private String ID;
        private String prof_name;
        private String prof_cred;
        private String course_details;
        private String Assingment;
        private int  password;
        private ArrayList<Student> Students;
        public void cource(String Name, String code, String Prof_name, String prof_cred,String Course_detail) {
            this.Name = Name;
            this.ID = code;
            this.prof_name = Prof_name;
            this.prof_cred = prof_cred;
            this.course_details=course_details;
            this.Students = new ArrayList<>();
        }
    public Student getStudentById(int rollNumber) {
        for (Student student : Students) {
            if (student.getRoll_no()==(rollNumber)) {
                return student;
            }
        }
        return null; // Return null if no student with the given ID is found
    }
    public void addStudent(Student student) {
        Students.add(student);
    }

    public String getID() {
        return ID;
    }
    public void setCourse_details(String course_details) {
        this.course_details = course_details;
    }
    public String getCourse_details() {
        return course_details;
    }
    public  void removestudent(Student  student){
            Students.remove(student);
    }
    public ArrayList<Student> getStudents() {
        return Students;
    }
        public String getAssingment() {
            return Assingment;
        }
        public void setAssingment(String assingment) {
           this.Assingment = assingment;
        }
        public int getPassword() {
            return password;
        }
        public void setPassword(int password) {
            this.password = password;
        }
        private String Announcement;
        public String getAnnouncement() {
            return Announcement;
        }
        public void setAnnouncement(String announcement) {
            Announcement = announcement;
        }
        public String getName() {
            return Name;
        }
        public String getCode() {
            return ID;
        }
        public String getProf_name() {
            return prof_name;
        }
        public String getProf_cred() {
            return prof_cred;
        }
        //
}

//class of student
    class Student {
       private   String Name;
        private int Roll_no;
        private double grade;
        private int password;
        public void Student(String name, int Roll) {
            this.Name = name;
            this.Roll_no = Roll;
        }
    public String getName() {
        return Name;
    }
    public int  getRoll_no() {
        return Roll_no;
    }
        public double getPassword() {
            return password;
        }
        public void setPassword(int password) {
            this.password = password;
        }
        public double getGrade() {
            return grade;
        }
        //not used yet
        public void setGrade(double grade) {
            this.grade = grade;
        }
    }
package com.LMS;
import com.LMS.*;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        CourseManager Course = new CourseManager();
        create cr = new create();
        boolean t = true;
        while (t) {
            // If no course is available, prompt to create one
            if (Course.getCourses().isEmpty()) {
                System.out.println("Create a Course");
                cource m = cr.create_Course();
                Course.addCourse(m);
            }
            System.out.println("-----------Are You a Student or Instructor " + "\n" + "For Student type 1 or For Instructor type 2 --------");
            System.out.println("To destroy program type 3 ");
            try {
                int n = src.nextInt();
                switch (n) {

                    case 1: {

                        boolean b = true;
                        while (b) {
                            try {
                                System.out.println("For search courses with course id type 1 : ");
                                System.out.println("For enroll in a course type 2 :");
                                System.out.println("For search all courses type 3 :");
                                System.out.println("For back type 4");
                                System.out.println("To track course type 5");
                                int num = src.nextInt();
                                switch (num) {
                                    case 1: {
                                        ////
                                        System.out.println("Enter course id ");
                                        src.nextLine();
                                        String Id = src.nextLine();
                                        cource k = Course.getCourseByID(Id);
                                        System.out.println("The name of course :" + k.getName());
                                        System.out.println("The id of course :" + k.getCode());
                                        System.out.println("Announcement about this course " + k.getAnnouncement());
                                        System.out.println("The course details : " + k.getCourse_details());
                                        System.out.println("Our instructor is :" + k.getProf_name());
                                        System.out.println("Instructor's credential :" + k.getProf_cred());
                                        boolean p = true;
                                        while (p) {
                                            try {
                                                System.out.println("Please enroll in this course if you are interested:");
                                                System.out.println("To enroll type 1 if you are enrolled type 2:");
                                                System.out.println("For back type 3:");
                                                int l = src.nextInt();
                                                switch (l) {
                                                    case 1: {
                                                        Student student = cr.create_student();
                                                        k.addStudent(student);
                                                        System.out.println("Enrolled confirmed access granted: ");
                                                        System.out.println("Your name: " + student.getName());
                                                        System.out.println("Your roll number: " + student.getRoll_no());
                                                        System.out.println("Your password: " + student.getPassword());
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Enter your password");
                                                        int pass = src.nextInt();
                                                        System.out.println("Enter your Roll number ");
                                                        int roll = src.nextInt();
                                                        Student st = k.getStudentById(roll);
                                                        if (st.getPassword() == pass) {
                                                            enrolled w = new enrolled();
                                                            w.enrolle(st, k);
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        p = false;
                                                        break;
                                                    }
                                                    default:
                                                        System.out.println("Enter correctly");
                                                }
                                            } catch (Exception e) {
                                                throw new RuntimeException(e);
                                            }
                                        }
                                       break;
                                    }
                                    case 2: {
                                        System.out.println("Enter course id ");
                                        src.nextLine();
                                        String Id = src.nextLine();
                                        cource k = Course.getCourseByID(Id);
                                        System.out.println("The name of course :" + k.getName());
                                        System.out.println("The id of course :" + k.getCode());
                                        System.out.println("Announcement about this course " + k.getAnnouncement());
                                        System.out.println("The course details : " + k.getCourse_details());
                                        System.out.println("Our instructor is :" + k.getProf_name());
                                        System.out.println("Instructor's credential :" + k.getProf_cred());
                                        Student student = cr.create_student();
                                        k.addStudent(student);
                                        System.out.println("Enrolled confirmed access granted : ");
                                        System.out.println("Your name: " + student.getName());
                                        System.out.println("Your roll number: " + student.getRoll_no());
                                        System.out.println("Your password: " + student.getPassword());
                                        break;
                                    }
                                    case 3: {
                                        ///to search all courses
                                        // I think there will be an exception
                                        try {
                                            for (int i = 0; i < Course.getCourses().size(); i++) {
                                                System.out.println(Course.getCourses().get(i).getName());
                                                System.out.println(Course.getCourses().get(i).getID());
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Error Found " + e);
                                        }
                                        break;
                                    }
                                    case 4: {
                                        b = false;
                                        break;
                                    }
                                    case 5:{
                                        System.out.println("Grade is updated");
                                        System.out.println("the  course is :");
                                        System.out.println();
                                        for (int i = 0; i < Course.getCourses().size(); i++) {
                                            System.out.println(Course.getCourseNamesAndIDs().get(i));
                                        }
                                        break;
                                    }
                                    default: {
                                        System.out.println("Type correctly ");
                                        break;
                                    }
                                }
                            } catch (Exception v) {
                                System.out.println("Something wrong: " + v);
                            }
                        }
                        break;
                    }
                    case 2: {
                        try {
                            boolean l = true;
                            while (l) {
                                System.out.println("For search course by id type 1 :");
                                System.out.println("For search all courses in one place type 2 :");
                                System.out.println("To create a new course type 3 :");
                                System.out.println("For back type 4 :");
                                System.out.println("To track a course type 5 :");
                                int num = src.nextInt();
                                switch (num) {
                                    case 1: {
                                        System.out.println("Enter course id ");
                                        src.nextLine();
                                        String Id = src.nextLine();
                                        cource k = Course.getCourseByID(Id);
                                        System.out.println("The name of course :" + k.getName());
                                        System.out.println("The id of course :" + k.getCode());
                                        System.out.println("Announcement about this course " + k.getAnnouncement());
                                        System.out.println("The course details : " + k.getCourse_details());
                                        System.out.println("Our instructor is :" + k.getProf_name());
                                        System.out.println("Instructor's credential :" + k.getProf_cred());
                                        instructor i = new instructor();
                                        i.instr(k,Course);
                                        break;
                                    }
             case 2: {
            System.out.println();
            for (int i = 0; i < Course.getCourses().size(); i++) {
                System.out.println(Course.getCourseNamesAndIDs().get(i));
            }
            break;
                                    }
                                    case 3: {
                                        cource m = cr.create_Course();
                                        Course.addCourse(m);
                                        break;
                                    }
                                    case 4: {
                                        l = false;
                                        break;
                                    }
                                    case 5:{
                                        System.out.println("The Course progress is displayed ,grades updated");
                                        System.out.println();
                                        for (int i = 0; i < Course.getCourses().size(); i++) {
                                            System.out.println(Course.getCourseNamesAndIDs().get(i));
                                        }
                                        break;
                                    }
                                }
                            }
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                        break;
                    }
                    case 3: {
                        t = false;
                        break;
                    }
                    default:
                        throw new IllegalStateException("Unexpected value: " + n);
                }
            } catch (Exception e) {
                System.out.println("Something Wrong " + e);
            }
        }
    }
}

class create {
    public cource create_Course() throws Exception {
        try {
            Scanner src = new Scanner(System.in);
            Scanner sr = new Scanner(System.in) ;
            String cname, id, profname, profcred, cdetail;
            int  password;
            System.out.println("Enter the Course Name");
            cname = src.nextLine();
            System.out.println("Enter Id of Course");
            id = src.nextLine();
            System.out.println("Enter course detail");
            cdetail = src.nextLine();
            System.out.println("Enter Instructor Name");
            profname = src.nextLine();
            System.out.println("Enter Instructor Credential");
            profcred = src.nextLine();
            System.out.println("Enter  your PassWord to access");
            password = sr.nextInt();
            /* /entry ends*/
            cource c = new cource();
            c.setPassword(password);
            c.cource(cname, id, profname, profcred, cdetail);
            c.setCourse_details(cdetail);
            System.out.println("Course is created Students can enrolled");
            System.out.println("Name of course :" +c.getName());
            System.out.println(" id of course :" +c.getID());
            System.out.println("password of course :" +c.getPassword());
            System.out.println("details of course :" +c.getCourse_details());
            return c;
        } catch (Exception e) {
            System.out.println("Alert Something Wrong :" + e);
        }
        return null;
    }
     public Student create_student()
     {
        try{
        Scanner src=new Scanner(System.in);
        Student s= new Student();
         System.out.println("Enter Your name");
         String n=src.nextLine();
            // Generate a random integer pos no
            Random randomNumber = new Random();
            int r = randomNumber.nextInt(Integer.MAX_VALUE)+1;
        s.Student(n, r);
            System.out.println("Enter your Password in int value ");
           int pass=src.nextInt();
            s.setPassword(pass);
            return  s;
     }catch (Exception e){
            System.out.println("Something Wrong :"+e);
        }
        return  null;
    }
}
class enrolled {
    Scanner src = new Scanner(System.in);

    public void enrolle(Student k, cource l) throws Exception {
        try {
            boolean a = true;
            while (a) {
                System.out.println("To change password type 1 :");
                System.out.println("To know about assignment Type 2:");
                System.out.println("To know about your Grade Type 3:");
                System.out.println("To know about your Rank Type 4 :");
                System.out.println("TO know about your detail Type 5: ");
                System.out.println("For exit type 6 :");
                int m = src.nextInt();
                src.nextLine();
                switch (m) {
                    case 1: {
                        System.out.println("Enter new password ");
                        int password = src.nextInt();
                        k.setPassword(password);
                        System.out.println("Your new password  :" + k.getPassword());
                        break;
                    }
                    case 2: {
                        System.out.println(l.getAssingment());
                        break;
                    }
                    case 3: {
                        System.out.println("Your grade is " + k.getGrade());
                        break;
                    }
                    case 4: {
                        RankCalculator r = new RankCalculator();
                        System.out.println(r.calculateRank(k, l));
                        break;
                    }
                    case 5: {
                        System.out.println("Your name is " + k.getName());
                        System.out.println("Your roll number" + k.getRoll_no());
                        System.out.println("Your password" + k.getPassword());
                        break;
                    }
                    case 6 :{
                        a = false;
                        break; // Move break statement here to exit the loop
                    }
                    default:{
                        System.out.println("type correctly ");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("something Wrong " + e);
        }
    }
}

class RankCalculator {
    public int calculateRank(Student student, cource course) {
        int rank = 1;
        double studentGrade = student.getGrade();
        // Iterate over all students in the course
        for (Student otherStudent : course.getStudents()) {
            if (otherStudent != student && otherStudent.getGrade() > studentGrade) {
                rank++;
            }
        }
        return rank;
    }
}
class instructor{
    Scanner src = new Scanner(System.in);
    Scanner sr = new Scanner(System.in);
   public void  instr(cource co,CourseManager k) throws  Exception{
       System.out.println("Enter your password");
       int p=src.nextInt();
       if(p==co.getPassword()){
        try{
            boolean n=true;
            while(n){
                System.out.println("To Give assignment type 1 :");
                System.out.println("To give grade to a student type 2 :");
                System.out.println("To remove a student in this course type 3 : ");
                System.out.println("TO update about this course type 4 :");
                System.out.println("To do some announcement type 5 ");
                System.out.println("To update password type 6 :");
                System.out.println("To go back type 7 :");
                System.out.println("To remove this course type 8");
                int number= src.nextInt();
                switch (number){
                    case 1:{
                        System.out.println("Enter assignment ");
                        String a = sr.nextLine();
                        co.setAssingment(a);
                        break;
                    }
                    case 2:{
                        System.out.println("The given assignment was" +co.getAssingment());
                        System.out.println("enter roll number of student ");
                        int roll=src.nextInt();
                        Student k1=co.getStudentById(roll);
                        System.out.println("Enter grade :");
                        double g=src.nextDouble();
                        k1.setGrade(g);
                        break;
                    }
                    case 3:{
                        System.out.println("Enter roll number ");
                        int r= src.nextInt();
                        Student s =co.getStudentById(r);
                        co.removestudent(s);
                        n=false;
                        break;
                    }
                    case 4:{
                        System.out.println("Enter what ever want to change in course detail");
                        String sd=sr.nextLine();
                        co.setCourse_details(sd);
                        System.out.println(co.getCourse_details());
                        break;
                    }
                    case 5:{
                        System.out.println("Enter announcement ");
                        String r= sr.nextLine();
                        co.setAnnouncement(r);
                        break;
                    }
                    case 6:{
                        System.out.println("Enter new password");
                        int pass=src.nextInt();
                        co.setPassword(pass);
                        System.out.println("New password :"+co.getPassword());
                        break;
                    }
                    case 7:{
                        n=false;
                        break;
                    }
                    case 8:{
                        k.removeCourse(co);
                        System.out.println(co.getName() + " is removed");
                        n=false;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
}

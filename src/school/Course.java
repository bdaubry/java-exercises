package school;

import java.util.HashMap;

public class Course {

    private String name;
    private static int nextCourseId = 1;
    private int courseNumber;
    private String department;
    private int creditHours;
    private final int courseId;
    private HashMap<Integer, String> studentRoster;

    public Course(String name, int courseNumber, String department, int creditHours, int courseId){
        this.name = name;
        this.courseNumber = courseNumber;
        this.department = department;
        this.creditHours = creditHours;
        this.courseId = courseId;
    }

    public Course(String name, int courseNumber, String department, int creditHours){
        this.name = name;
        this.courseNumber = courseNumber;
        this.courseId = nextCourseId;
        nextCourseId++;
        this.department = department;
        this.creditHours = creditHours;
    }

    public void addStudent(Student student){
        String studentName = student.getName();
        int studentId = student.getStudentId();
        studentRoster.put(studentId, studentName);
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getCourseId() {
        return courseId;
    }

    public HashMap<Integer,String> getStudentRoster() {
        return studentRoster;
    }

}

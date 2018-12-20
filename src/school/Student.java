package school;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private static int nextStudentId;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    private HashMap<Integer, Double> grades = new HashMap<>();

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId){
        this(name, studentId, 0, 0.0);
    }

    public Student(String name){
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade){

        numberOfCredits += courseCredits;
        grades.put(courseCredits, grade);
        double qualityScoreKeeper = 0;
        for (Map.Entry<Integer, Double> gradeScore : grades.entrySet()){
            double score = gradeScore.getKey() * gradeScore.getValue();
            qualityScoreKeeper += score;
        }
        double newGpa = qualityScoreKeeper/numberOfCredits;
        setGpa(newGpa);
    }

    public String getGradeLevel(){
        //TODO

    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public void setNumberOfCredits(int credits){
        numberOfCredits += credits;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double aGpa){
        gpa = aGpa;
    }
}

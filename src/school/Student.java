package school;

public class Student {
    private static int nextStudentId;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;


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
        double qualityScore = grade * courseCredits;
        double currentQualityScore = gpa * numberOfCredits;
        numberOfCredits += courseCredits;
        this.setGpa((qualityScore+currentQualityScore)/numberOfCredits);
    }

    public String getGradeLevel(){
        //TODO
        String gradeLevel = "";

        if(numberOfCredits >= 0 && numberOfCredits <30){
            gradeLevel = "Freshman";
        } else if(numberOfCredits >= 30 && numberOfCredits < 60){
            gradeLevel = "Sophomore";
        } else if(numberOfCredits >= 60 && numberOfCredits < 90){
            gradeLevel = "Junior";
        } else if(numberOfCredits >= 90){
            gradeLevel = "Senior";
        }
        return gradeLevel;
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

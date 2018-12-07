package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIDHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String NewStudent;
        int NewStudentId;

        System.out.println("Enter student name or Press Enter");
        do{
            System.out.println("Student: ");
            NewStudent = in.nextLine();
            if(!NewStudent.equals("")) {
                System.out.println("Student ID: ");
                NewStudentId = in.nextInt();
                students.put(NewStudentId, NewStudent);
            }
        } while(!NewStudent.equals(""));

        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }


    }
}

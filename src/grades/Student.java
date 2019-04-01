package grades;

import java.util.*;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);

        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student toby = new Student("Toby");
        System.out.println(toby);
        toby.addGrade(76);
        System.out.println(toby.getGradeAverage());
    }




}

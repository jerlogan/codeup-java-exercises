package grades;
import oop.Person;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student jim = new Student("Jim");
        Student dwight = new Student("Dwight");
        Student andy = new Student("Andy");
        Student michael = new Student("Michael");

        jim.addGrade(87);
        jim.addGrade(94);
        jim.addGrade(79);
        jim.addGrade(99);

        dwight.addGrade(89);
        dwight.addGrade(65);
        dwight.addGrade(89);
        dwight.addGrade(90);

        andy.addGrade(78);
        andy.addGrade(81);
        andy.addGrade(68);
        andy.addGrade(76);

        michael.addGrade(100);
        michael.addGrade(98);
        michael.addGrade(99);
        michael.addGrade(96);

        students.put("bears-beats-battlestar", jim);
        students.put("Scrantons_finest", dwight);
        students.put("cornell99", andy);
        students.put("little_kid_luvr", michael);


        //        #3  ------------------------------------->>>>>>>>


        for (String key : students.keySet()) {
            System.out.print("|" + key + "| ");
        }

        Scanner scanner;

        do {
            scanner = new Scanner(System.in);
            System.out.println();

            System.out.println("\nWhich user would you like to see more information about? \n");
            String userInput = scanner.next();


            if (students.containsKey(userInput)) {
                Student pickedStudent = students.get(userInput);

                System.out.println("Name: " + pickedStudent.getName() + " - Github Username: "
                + userInput  + "\nCurrent Average: " + pickedStudent.getGradeAverage() + "\n");

//                BONUSES------------------------------------------------>

                ArrayList<Double> allGrades = new ArrayList<>();
                for (Student grades : students.values()){
                    allGrades.add(grades.getGradeAverage());
                }

                double sum = 0;
                double everyoneAverage;
                for (int i = 0; i < allGrades.size(); i++) {
                    sum += allGrades.get(i);
                }
                everyoneAverage = sum / allGrades.size();
                System.out.println(everyoneAverage + " is the average of all students!");


                System.out.println("Here are all the grades of " + pickedStudent.getName() + ": \n" +
                        pickedStudent.getGrades());

//                <-------------------------------------------------------------

                System.out.println("Would you like to see another student?");

            } else {
                System.out.println("sorry, that's not a valid username. \n" +
                        "Would you like to try again? yes | no");
            }

        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("goodbye");
    }

}

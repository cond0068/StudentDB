package studentdatabase;

import java.util.Scanner;

/**
 * A class for storing information about Students
 */
public class StudentDatabase implements Constants {
    Student[] db;
    int studentCount;

    public StudentDatabase() {
        db = new Student[NUMBER_OF_STUDENTS];
        studentCount = 0;
    }

    public void addStudent(String s) {
        Scanner scan = new Scanner(s);
        scan.useDelimiter(",");
        switch (scan.next().charAt(0)) {
            case 'A':

                break;
            case 'M':

                break;
            case 'S':

                break;
        }
    }

    public Student findStudent(String ID) {

        return null;
    }

    public void addResult(String s) {

    }

    public void awardPrize(String prize, String template, int topicsRequired) {

    }

    public void printRecords() {

    }

    public void clearRecords() {
        for (; studentCount > 0; )
            db[--studentCount] = null;
    }

}

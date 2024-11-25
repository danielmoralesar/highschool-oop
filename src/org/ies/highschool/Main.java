package org.ies.highschool;

import org.ies.highschool.components.StudentReader;
import org.ies.highschool.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentReader StudentReader = new StudentReader(scanner);
        Student student = StudentReader.read();
        student.showInfo();
    }
}
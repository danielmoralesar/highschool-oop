package org.ies.highschool.components;

import org.ies.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student read() {
        System.out.println("Introduzca el nombre del estudiante: ");
        String name = scanner.nextLine();

        System.out.println("Introduzca el apellido del estudiante: ");
        String lastName = scanner.nextLine();

        System.out.println("Introduzca la dirección del estudiante: ");
        String address = scanner.nextLine();

        return new Student(
                name,
                lastName,
                address
        );
    }
}

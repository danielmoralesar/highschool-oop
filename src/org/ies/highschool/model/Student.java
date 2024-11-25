package org.ies.highschool.model;

import java.util.Objects;

public class Student {
    private String name;
    private String lastName;
    private String address;

    public Student(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("Nombre: " + name + " " + lastName);
        System.out.println("Dirección: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student students = (Student) o;
        return Objects.equals(name, students.name) && Objects.equals(lastName, students.lastName) && Objects.equals(address, students.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, address);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

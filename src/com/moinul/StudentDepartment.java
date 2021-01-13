package com.moinul;

import java.util.ArrayList;
import java.util.List;


public class StudentDepartment {


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        Department department = new Department("CSE", studentList);
        Student student = new StudentBuilder().setDepartment(department).setName("Moinul").getStudent();
        Student student2 = new StudentBuilder().setDepartment(department).setName("Riad").getStudent();

        department.notifyStudents();
        System.out.println(student);
        System.out.println(student2);
        System.out.println(department);
        System.out.println(studentList);
    }
}

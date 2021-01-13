package com.moinul;

import java.util.List;

public final class Department {

    private static Long idCounter = 0L;

    public static Long createID() {
        return ++idCounter;
    }

    private final Long id;
    private final String name;
    private final List<Student> studentList;

    public Department(String name, List<Student> studentList) {
        this.id = createID();
        this.name = name;
        this.studentList = studentList;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    void addStudent(Student student) {
        studentList.add(student);
    }

    void removeStudent(Student student) {
        studentList.remove(student);
    }

    public void notifyStudents() {
        for (Student student : studentList) {
            student.getNotice();
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

package com.moinul;


public class StudentBuilder {
    private Long id;
    private String name;
    private Department department;

//    public StudentBuilder setId(Long id) {
//        this.id = id;
//        return this;
//    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setDepartment(Department department) {
        this.department = department;
        return this;
    }

    public Student getStudent() {
        return new Student(name, department);
    }
}

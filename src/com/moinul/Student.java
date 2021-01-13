package com.moinul;


public final class Student {
    private static Long idCounter = 0L;

    public static Long createID() {
        return ++idCounter;
    }

    private final Long id;
    private final String name;
    private final Department department;

    public Student(String name, Department department) {
        this.id = createID();
        this.name = name;
        this.department = department;
        setDepartment(department);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    private void setDepartment(Department department) {
        department.addStudent(this);
    }

    public void getNotice() {
        System.out.println(this.name + " got the notice");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department.getName() +
                '}';
    }
}

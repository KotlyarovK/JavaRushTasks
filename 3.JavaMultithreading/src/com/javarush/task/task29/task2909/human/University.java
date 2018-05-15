package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<Student>();
    private String name;
    private int age;

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() == averageGrade) {
                 student = students.get(i);
            }
        }
        return student;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student student = null;
        double max = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() > max) {
                max = students.get(i).getAverageGrade();
                student = students.get(i);
            }
        }
        return student;
    }

    public Student getStudentWithMinAverageGrade(){
        Student student = null;
        double min = getStudentWithMaxAverageGrade().getAverageGrade();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < min) {
                min = students.get(i).getAverageGrade();
                student = students.get(i);
            }
        }
        return student;
    }

    public void expel(Student student) {
        students.remove(student);
    }

}
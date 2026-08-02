/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javareview;

import java.util.ArrayList;

/**
 *
 * @author dodoq
 */
public class Student {
     String name;
     int id;
     double grade;
     ArrayList<Course> courses;
     
      public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        courses = new ArrayList<>();
    }
       public void enrollCourse(Course course) {
        courses.add(course);
    }
        public void printReport() {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
        System.out.println("Courses:");

        for (Course course : courses) {
            System.out.println(course.title + " (" + course.code + ")");
        }
        }
}

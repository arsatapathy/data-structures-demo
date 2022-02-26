package com.arsatapathy.older.arrays;

import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {

        Comparator<Student> comparator = (Student student1, Student student2) -> {
            return student1.getRollNo() - student2.getRollNo();
        };

        Student student1 = new Student(123, "Ashish");
        Student student2 = new Student(456, "Ranjan");
        Student student3 = new Student(789, "Satapathy");

        Student[] students = new Student[3];

        students[0] = student2;
        students[1] = student3;
        students[2] = student1;

        for (Student student:
             students) {
            System.out.print(student + ", ");
        }

        Student temp;

        for (int i = 0; i < students.length; i++) {
            for (int j = i+1; j < students.length; j++) {
                if (comparator.compare(students[i], students[j]) > 0){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("\nAfter sort");

        for (Student student:
                students) {
            System.out.print(student + ", ");
        }

        print("\nashish");

        print(student1);

    }

    public static <T> void print(T item) {
        System.out.println(item);
    }
}

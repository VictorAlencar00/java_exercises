package application;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A?" );

        int amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            int code = sc.nextInt();
            students.add(new Student(code));
        }

        System.out.print("How many students for course B?" );
        amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            int code = sc.nextInt();
            students.add(new Student(code));
        }

        System.out.print("How many students for course C?" );
        amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            int code = sc.nextInt();
            students.add(new Student(code));
        }

        System.out.println("Total students: " + students.size());

        sc.close();
    }
}

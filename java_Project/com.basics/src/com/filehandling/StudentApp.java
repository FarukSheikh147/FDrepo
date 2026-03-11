package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class StudentApp {

    static class Student {
        private int rollNo;
        private String name;
        private int maths;
        private int science;
        private int english;

        public Student(int rollNo, String name, int maths, int science, int english) {
            this.rollNo = rollNo;
            this.name = name;
            this.maths = maths;
            this.science = science;
            this.english = english;
        }

        public int getGrandTotal() {
            return maths + science + english;
        }

        public double getPercentage() {
            return (getGrandTotal() / 300.0) * 100.0;
        }

        public String toCsv() {
            String safeName = name.replace(",", " ");
            return rollNo + "," + safeName + "," + maths + "," + science + "," + english;
        }

        public static Student fromCsv(String line) {
            Objects.requireNonNull(line, "CSV line is null");
            String[] p = line.split(",", -1);
            if (p.length != 5) throw new IllegalArgumentException("Invalid line: " + line);
            return new Student(
                Integer.parseInt(p[0].trim()),
                p[1].trim(),
                Integer.parseInt(p[2].trim()),
                Integer.parseInt(p[3].trim()),
                Integer.parseInt(p[4].trim())
            );
        }

        @Override
        public String toString() {
            return "Roll: " + rollNo + ", Name: " + name +
                   ", Maths: " + maths + ", Science: " + science + ", English: " + english;
        }
    }

    private static final int STUDENT_COUNT = 5;
    private static final String FILE_NAME = "student.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        Student[] students = new Student[STUDENT_COUNT];

        System.out.println("=== Enter Students Data ===");
        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            int rollNo = readInt(sc, "Roll No: ");
            String name = readNonEmptyString(sc, "Name: ");
            int maths = readMarks(sc, "Maths marks: ");
            int science = readMarks(sc, "Science marks: ");
            int english = readMarks(sc, "English marks: ");

            students[i] = new Student(rollNo, name, maths, science, english);
        }

        Path out = Paths.get(FILE_NAME);
        try (BufferedWriter bw = Files.newBufferedWriter(out, StandardCharsets.UTF_8)) {
            for (Student s : students) {
                bw.write(s.toCsv());
                bw.newLine();
            }
            System.out.println("\nFile written: " + out.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error writing file");
            return;
        }

        System.out.println("\n=== Reading File ===");
        try (BufferedReader br = Files.newBufferedReader(out, StandardCharsets.UTF_8)) {
            String line;
            int i = 1;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                Student s = Student.fromCsv(line);
                System.out.printf(
                    "Student %d -> %s | Total: %d | Percentage: %.2f%%\n",
                    i, s.toString(), s.getGrandTotal(), s.getPercentage()
                );
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file");
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.println("Enter a number."); }
        }
    }

    private static String readNonEmptyString(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Cannot be empty.");
        }
    }

    private static int readMarks(Scanner sc, String prompt) {
        while (true) {
            int m = readInt(sc, prompt);
            if (m >= 0 && m <= 100) return m;
            System.out.println("Marks must be 0–100.");
        }
    }
}
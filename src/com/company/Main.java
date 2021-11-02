package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.text.FieldPosition;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void print(int[] array) {
        System.out.println("Værdierne i arrayet er: " + Arrays.toString(array));
    }

    public static void gennemsnit(int[] array, int count) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("Gennemsnittet af værdierne i arrayet er: " + (sum / count));
    }

    public static void writeFile(int[] array) {
        try {
            PrintWriter file = new PrintWriter("Datafile.txt");
            for (int j : array) {
                file.println(j);
            }
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void readFile(int[] array) {
        try {
            File file = new File("Datafile.txt");
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        print(array);
    }

    public static void multiplier(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
    }

    public static void writeDataFile(int[] array) {
        try {
            FileOutputStream output = new FileOutputStream("Datafile.dat");
            for (int i = 0; i < array.length; i++) {
                output.write(array[i]);
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataFile() throws IOException {
        FileInputStream input = new FileInputStream("Datafile.dat");
        int value;
        value = input.read();
        System.out.println("The numbers in the file are:  ");
        try {
            while (value != -1) {
                System.out.print(value + " ");
                value = input.read();
            }
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.format("Indtast den %d. værdi.\n", i + 1);

            array[i] = scanner.nextInt();
        }
    }
}

package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final FileManager fm = new FileManager();

    public static void main( String[] args ) {
        char option = ' ';
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\n\nSelect an option to continue:");
            System.out.println(" c) Create a file.");
            System.out.println(" w) Write a file.");
            System.out.println(" r) Read a file.");
            System.out.println(" p) Get an absolute path of file.");
            System.out.println(" e) Exit.");

            option = sc.next().charAt(0);
            sc.nextLine();

            switch (option) {
                case 'c':
                    createF();
                    break;
                case 'w':
                    writeF();
                    break;
                case 'r':
                    readF();
                    break;
                case 'p':
                    getAbsPathF();
                    break;
                case 'e':
                    System.out.println("Exiting.");
                    break;
                default: System.out.println( option + " is not a valid option.");
            }

        } while (option != 'e');
    }

    public static void createF() {
        System.out.println("Enter the new file name:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        fm.createFile(fileName);

        return;
    }

    public static void writeF() {
        System.out.println("enter the name of the file to edit:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        System.out.println("Enter the text for the file (Only 1 line):");
        String text = sc.nextLine();

        fm.writeFile(text, fileName);
        return;
    }

    public static void readF() {
        System.out.println("Enter the file name:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        fm.read(fileName);
        return;
    }

    public static void getAbsPathF () {
        System.out.println("Enter file name:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        fm.getAbsPath(fileName);
        return;
    }
}

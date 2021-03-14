package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    private String directoryRoute = "src/main/Files/";

    public FileManager (String route) {
        this.directoryRoute = route;
    }

    public FileManager (){

    }

    public void createFile (String fileName) {
        try {
            File nFile = new File(this.directoryRoute + fileName);
            if (nFile.createNewFile()) {
                System.out.println("The file " + nFile.getName() + " has been created successfully.");
            } else {
                System.out.println("An error occurred, is possible that a file with a same name already exist in the current directory");
            }

        } catch (IOException e) {
            System.out.println("An error occurred, " + e.getMessage());
        }
    }

    public void writeFile (String textContent, String fileName) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(this.directoryRoute + fileName);
            writer.write(textContent);
            writer.close();
            System.out.println("The file has been written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred, " + e.getMessage());
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e2) {
                    System.out.println("An error occurred, " + e.getMessage());
                }
            }
        }
    }

    public void read (String fileName) {
        Scanner reader = null;
        try {
            File nFile = new File(this.directoryRoute + fileName);
            reader = new Scanner(nFile);
            while (reader.hasNextLine()) {
                String textContent = reader.nextLine();
                System.out.println(textContent);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred, " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void getAbsPath (String fileName) {
        try {
            File nFile = new File(this.directoryRoute + fileName);
            if (nFile.exists() && !fileName.equals("")) {
                System.out.println("The absolute path of " + fileName + " is: " + nFile.getAbsolutePath());
            } else {
                System.out.println("The File does not exist.");
            }
        } catch (SecurityException e) {
            System.out.println("An error occurred, " + e.getMessage());
        }
    }
}

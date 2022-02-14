package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingInJava {
    public static void main(String[] args){
        // Creating a New File
//        File myFile = new File("FileHandlingInJava.txt");
//        try{
//            myFile.createNewFile();
//            System.out.println("File created Successfully!");
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        // Writing in a File
//        File myFile = new File("FileHandlingInJava.txt");
//        try{
//            FileWriter fileWriter = new FileWriter("FileHandlingInJava.txt");
//            fileWriter.write("CodeWithOmkar is one step solution for your all programming problems.\nKeep learning, Keep coding!");
//            fileWriter.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        // Reading a File
//        File myFile = new File("FileHandlingInJava.txt");
//        try{
//            Scanner sc = new Scanner(myFile);
//            while (sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        // Deleting a File
        File myFile = new File("FileHandlingInJava.txt");
        if (myFile.delete()){
            System.out.println("I have deleteted : " + myFile.getName());
        }else{
            System.out.println("Some problems occurred while deleting the file!");
        }


    }
}

package testautomation.learningexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        createNewFile();
        numbersExceptionHandling();
        //createNewFileRethrow();
        calculateSalary(41,20);

    }

    public static void createNewFile() {
        //this file will throw an IOexception
        //java attempts to run createNewFile if an exception happens to be thrown (try)
        // then the catch block will execute if the exception is caught
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();

        }catch (IOException e) { //specify the exception you want to catch
            System.out.println("Directory does not exist");

        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("/resources/number.txt");

        //Scanner implements Closeable/AutoCloseable interface
        //so you can pass it in parantheses onto try that means
        // when the try catch is done it will close the file.
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("File not found");
        }
    }


    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    //a method can throw an exception by using the word throw inside of the methods body
    public static void calculateSalary(double hours, double rate){
        if (hours > 40){
            throw new IllegalArgumentException("We do not allow overtime");
        }
    }
}

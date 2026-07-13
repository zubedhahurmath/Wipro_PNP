package inputOutputOperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        try {
            FileReader fr = new FileReader("src/" + inputFile);
            FileWriter fw = new FileWriter("src/" + outputFile);

            int data;
            while ((data = fr.read()) != -1) {
                fw.write(data);
            }

            fr.close();
            fw.close();

            System.out.println("File is copied.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

}

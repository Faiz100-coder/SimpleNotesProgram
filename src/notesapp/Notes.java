package notesapp;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Notes {
	
	    private static final String FILE_NAME = "notes.txt";
	    private static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("1. Add Note");
	            System.out.println("2. View Notes");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int option = Integer.parseInt(sc.nextLine());

	            switch (option) {
	                case 1:
	                    addNote();
	                    break;
	                case 2:
	                    viewNotes();
	                    break;
	                 // System.exit(0); // Would terminate the JVM immediately
	                    //return; ->  Would exit the main method, but JVM might still run
	                case 3:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid option. Please choose again.");
	            }
	        }
	    }

	    private static void addNote() {
	        System.out.print("Enter your note: ");
	        String note = sc.nextLine();
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
	            writer.write(note);
	            writer.newLine();
	            System.out.println("Note added successfully!");
	        } catch (IOException e) {
	            System.out.println("Error adding note: " + e.getMessage());
	        }
	    }

	    private static void viewNotes() {
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            System.out.println("Your Notes:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("No notes available or error reading notes: " + e.getMessage());
	        }
	    
	}
}

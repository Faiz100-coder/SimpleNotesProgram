# SimpleNotesProgram
 text-based notes manager with file read/write

Notes App
A simple command-line notes manager written in Java.
Features
Add notes to a file
View all notes in the file
Exit the program

Usage
tool or ide : eclipse
or 
Compile the program: javac NotesApp.java
Run the program: java NotesApp
Choose an option:
1: Add Note
2: View Notes
3: Exit

Notes File
Notes are stored in a file named notes.txt in the same directory as the Java program.
Expected Output
Here's an example of what the program's output might look like:
Code

1. Add Note
2. View Notes
3. Exit
Choose an option: 1
Enter your note: Buy milk
Note added successfully!

1. Add Note
2. View Notes
3. Exit
Choose an option: 1
Enter your note: Walk the dog
Note added successfully!

1. Add Note
2. View Notes
3. Exit
Choose an option: 2
Your Notes:
Buy milk
Walk the dog

1. Add Note
2. View Notes
3. Exit
Choose an option: 3

Error Handling
If there's an error reading or writing to the notes file, the program will display an error message. 
For example:
Error adding note: notes.txt (Permission denied)
or
No notes available or error reading notes: notes.txt (No such file or directory)

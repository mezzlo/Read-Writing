import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileTextChanger
{
  public static void main(String[] args) throws Exception{
    //Declaring variables
    Scanner kbInput = new Scanner(System.in); //Kb Input
    String file = "Example.txt"; //File where info is kept
    String fileContents = ""; //Content of file for program
    
    //Asks user what they would like to replace
    System.out.print("What would you like to replace? : "); // Prompt
    String usrLookingFor = kbInput.nextLine(); // Saves what user is looking for
    
    System.out.print("What would you like to replace it with? : "); // Prompt
    String usrReplace = kbInput.nextLine(); // Saves what user would like to change it to
    
    //Creates scanner that reads file
    Scanner fileReader = new Scanner(new FileReader(file));
    
    //While file reader has a next line.. DO:
    while(fileReader.hasNext()){
      fileContents += fileReader.nextLine();//Makes current line of fileContent = current line of file
      fileContents += "\n"; //Creates new line
    }
    fileReader.close(); // Closes file reader so we can write
    
    System.out.println("FileContents: \n"+fileContents); // Prints to console original form of file
    
    String updatedFileContent = fileContents.replace(usrLookingFor, usrReplace); //Creates updated form of file
    
    System.out.print("UpdatedContents: \n"+updatedFileContent);// Prints to console updated form of file
    
    //Creates new PrintWriter object
    PrintWriter writeOut = new PrintWriter(file);
    writeOut.println(updatedFileContent); //Writes updated form of file to file
    writeOut.close();//Closes File
    
  }
}

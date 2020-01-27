import java.io.*;

public class FileHandlingTutorial {

    private static String readFile(String fileName) {
        // Declare an empty string
        String read = "";
        // Try
        try {
            // Create the file object using the passed name
            File file = new File(fileName);
            // Create the file reader object
            FileReader fileReader = new FileReader(file);
            // Create the buffered reader object
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Create a temporary String
            String line = null;
            // While there are still lines to read
            while((line = bufferedReader.readLine()) != null) {
                // Concatenate the string
                read += line;
            }
            // Close the readers
            fileReader.close();
            bufferedReader.close();
            // Return the String
            return read;
        }
        // Catch any exception that occurs
        catch (Exception e) {}
        // Return the String
        return read;
    }

    private static void writeFile(String fileName, String stringToWrite) {
        // Try
        try {
            // Create the file object with the filename
            File file = new File(fileName);
            // Create the file writer object
            FileWriter fileWriter = new FileWriter(file);
            // Create the buffered writer object
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // Write the string to the file
            bufferedWriter.write(stringToWrite);
            // Flush the buffer
            bufferedWriter.flush();
            // Close the writer
            fileWriter.close();
            // Close the writer
            bufferedWriter.close();
        }
        catch (Exception e) {}
    }
    public static void main(String args[]) {
        // Create a string
        String sentence = "This is my sentence.";

        // Write string to file with function
        writeFile("Testfiles/WriteOut.txt", sentence);

        // Read the file into this String
        String readIn = readFile("TestFiles/WriteOut.txt");

        // Output the read string
        System.out.println(readIn);
    }
}

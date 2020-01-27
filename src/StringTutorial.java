public class StringTutorial {

    // Declaring a String object
    String exampleString = "Hello World!";

    public static void main(String args[]) {
        StringTutorial tutorial = new StringTutorial();

        // Declare Strings
        String hello = "Hello";
        String world = "World";
        String exclamationPoint = "!";
        String space = " ";
        // Concatenate
        String concatenate = hello + space + world + exclamationPoint;
        System.out.println(concatenate);

        // Declare String
        String list = "Welcome to Program with Sam!";
        // Test substring with 1 index
        String substringA = list.substring(11);
        // Test substring with 2 indices
        String substringB = list.substring(11, 18);
        System.out.println(substringA);
        System.out.println(substringB);

        // Declare String
        String sentence = "The cat sat on the mat";
        // Test replace
        String replaced = sentence.replace("cat", "dog");
        System.out.println(replaced);

        // Declare Strings
        String exampleA = "ABC";
        String exampleB = "DeF";
        String exampleC = "ghI";
        String exampleD = "JKL";
        // Test matches
        System.out.println(exampleA.matches("[A-Z][A-Z][A-Z]"));
        System.out.println(exampleB.matches("[A-Z][A-Z][A-Z]"));
        System.out.println(exampleC.matches("[A-Z][A-Z][A-Z]"));
        System.out.println(exampleD.matches("[A-Z][A-Z][A-Z]"));

        // Declare Strings
        String x = "Hello World!";
        String y = "Not Hello World!";
        String z = x;
        // Test equals
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));

        // Declare String
        String experiment = "The cat sat on the car";
        // Test length
        System.out.println(experiment.length());

    }
}

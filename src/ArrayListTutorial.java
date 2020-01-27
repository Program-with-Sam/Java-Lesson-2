import java.util.ArrayList;

public class ArrayListTutorial {

    public static ArrayList<String> returnArrayList() {
        ArrayList<String> aNewList = new ArrayList<>();
        aNewList.add("A ");
        aNewList.add("new ");
        aNewList.add("list.");
        return aNewList;
    }

    public static String[] returnArray() {
        String list[] = {"A ", "new ", "list."};
        return list;
    }

    public static void main(String args[]) {
        // Declare ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        // Add elements to a list
        stringList.add("Hello");
        stringList.add(" ");
        stringList.add("World!");

        // Get the length of the list
        System.out.println("Length is : " + stringList.size());

        // Get the element at a specific index
        System.out.println("String at index 2: " + stringList.get(2));

        // Using the toString() function
        System.out.println("toString() function: " + stringList.toString());

        // Setting the object at a given element
        stringList.set(0, "Goodbye");

        // Check if there is an element in the list
        System.out.println(stringList.contains("World!"));

        // Iterating over the list
        for(String x : stringList) {
            System.out.print(x);
        }
        System.out.println();

        // Testing returning array
        System.out.println(returnArray().toString());

        // Testing return ArrayList
        System.out.println(returnArrayList().toString());
    }
}
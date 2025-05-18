//Linked List Programs
//Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not( Hint : Use ArrayListObj.contains() )
import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        // Print the colors
        System.out.println("List of colors: " + colors);

        // Search for the color "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is not available in the list.");
        }
    }
}
//Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
import java.util.ArrayList;

public class ColorListManager {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removed = colors.remove(1);
            System.out.println("Removed 2nd element: " + removed);
        }

        // Remove the color "Blue" if it exists
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed color: Blue");
        } else {
            System.out.println("Color Blue was not found in the list.");
        }

        // Display the final list
        System.out.println("Final list of colors: " + colors);
    }
}
//Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add different colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Sort the list alphabetically
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted list of colors: " + colors);
    }
}
//Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.ArrayList;
import java.util.List;

public class ColorSubListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Extract 1st and 2nd elements using subList (index 0 to 2, exclusive of 2)
        List<String> subList = colors.subList(0, 2);

        // Display the extracted sublist
        System.out.println("Extracted 1st and 2nd elements: " + subList);
    }
}
//Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
import java.util.ArrayList;
import java.util.Scanner;

public class ColorListRemoval {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original list of colors: " + colors);

        // Get the index to remove from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the element to remove: ");
        int index = scanner.nextInt();

        // Check if index is valid and remove the element
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (colors.size() - 1));
        }

        // Display the updated list
        System.out.println("Updated list of colors: " + colors);
    }
}
//Linked List Programs
//Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Create a ListIterator starting at index 1 (2nd element)
        ListIterator<String> iterator = colors.listIterator(1);

        System.out.println("Iterating from 2nd element:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
//Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Get the descending iterator (reverse order)
        Iterator<String> reverseIterator = colors.descendingIterator();

        System.out.println("Iterating in reverse order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
//Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
import java.util.LinkedList;

public class InsertAtEndLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> l_listobj = new LinkedList<>();

        // Add some initial elements to the linked list
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Blue");

        // Display the linked list before insertion
        System.out.println("Original LinkedList: " + l_listobj);

        // Insert the specified element at the end
        l_listobj.offerLast("Pink");

        // Display the linked list after insertion
        System.out.println("Updated LinkedList: " + l_listobj);
    }
}
//Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
import java.util.LinkedList;

public class DisplayElementsWithPositions {
    public static void main(String[] args) {
        // Create and initialize a LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();
        l_listobj.add("Apple");
        l_listobj.add("Banana");
        l_listobj.add("Cherry");
        l_listobj.add("Date");

        // Display elements with their positions using get(index)
        System.out.println("Elements in the LinkedList with their positions:");
        for (int i = 0; i < l_listobj.size(); i++) {
            System.out.println("Position " + i + ": " + l_listobj.get(i));
        }
    }
}
//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSwapExample {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add some colors
        colors.add("Red");     // index 0
        colors.add("Green");   // index 1
        colors.add("Blue");    // index 2
        colors.add("Yellow");  // index 3
        colors.add("Purple");  // index 4

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Swap the first (index 0) and third (index 2) elements
        Collections.swap(colors, 0, 2);

        // Display the list after swapping
        System.out.println("LinkedList after swapping 1st and 3rd elements: " + colors);
    }
}

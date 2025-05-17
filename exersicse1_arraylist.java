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

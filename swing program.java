//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListConsole {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List");

        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String country : countryList.getSelectedValuesList()) {
                    System.out.println("Selected: " + country);
                }
            }
        });

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

//Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display the concerned color whenever the specific tab is selected in the Pan.
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Tabs");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        tabbedPane.addTab("RED", redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        tabbedPane.addTab("BLUE", bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        tabbedPane.addTab("GREEN", greenPanel);

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
  import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;

public class CountryCapitalList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Capitals");

        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);
        JScrollPane scrollPane = new JScrollPane(countryList);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String country : countryList.getSelectedValuesList()) {
                    String capital = capitalMap.get(country);
                    System.out.println("Capital of " + country + ": " + capital);
                }
            }
        });

        frame.add(scrollPane);
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan
import javax.swing.*;
import java.awt.*;

public class CMYTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CMY Colors");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


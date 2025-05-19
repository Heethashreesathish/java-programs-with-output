//.Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing  Programming in Blue color plain font with font size of 32 using Jframe and Jlabel
import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome Frame");
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font, color
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        // Add to frame
        frame.add(label);
        frame.setSize(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window
        frame.setVisible(true);
    }
}
// Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( )
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button");
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");
        JLabel label = new JLabel("Press a button", SwingConstants.CENTER);

        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Layout
        frame.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnIndia);
        buttonPanel.add(btnSrilanka);

        frame.add(label, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners
        btnIndia.addActionListener(e -> label.setText("India is pressed"));
        btnSrilanka.addActionListener(e -> label.setText("Srilanka is pressed"));

        // Frame setup
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
//Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Buttons");
        JLabel label = new JLabel("Click an image", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        // Load images (make sure these image files are in your project directory)
        ImageIcon clockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

        JButton btnClock = new JButton(clockIcon);
        JButton btnHourGlass = new JButton(hourGlassIcon);

        // Panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(btnClock);
        panel.add(btnHourGlass);

        // Add to frame
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Action listeners
        btnClock.addActionListener(e -> label.setText("Digital Clock is pressed"));
        btnHourGlass.addActionListener(e -> label.setText("Hour Glass is pressed"));

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

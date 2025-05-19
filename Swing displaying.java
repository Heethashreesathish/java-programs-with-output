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

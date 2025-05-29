import javax.swing.*;
import java.awt.*;

public class LargeTextDisplay extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Enable better graphics quality
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Set a large font size and style
        Font font = new Font("Arial", Font.BOLD, 100); // You can change font size/style
        g2d.setFont(font);

        // Set the text color
        g2d.setColor(Color.BLUE);

        // Draw the word "PANDHI" in the center
        g2d.drawString("PANDHI", 100, 200);  // Adjust x and y to position as needed
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Word Graphically - PANDHI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400); // Width, Height
        frame.add(new LargeTextDisplay());
        frame.setLocationRelativeTo(null); // Center the frame on screen
        frame.setVisible(true);
    }
}

import java.awt.*;
import javax.swing.*;
import packages.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and configure the main panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(0xffff9e));

        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی", SwingConstants.CENTER);

        // Create start button
        JButton startButton = new JButton("شروع!");
        startButton.setBackground(new Color(100,150,200));
        startButton.setForeground(Color.WHITE);
        startButton.setFocusPainted(false);
        startButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panel.add(title, BorderLayout.CENTER);
        panel.add(startButton, BorderLayout.SOUTH);

        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);


            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

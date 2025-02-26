package packages;

import javax.swing.*;
import java.awt.Font;

public class thankYouPage {

    public void create(JFrame frame) {
        //Create a custom font
        Font customFont = new Font("Arial", Font.BOLD, 15);

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!");
        thankYouLabel.setFont(customFont);
        thankYouLabel.setBounds(10, 10, 200, 20);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}

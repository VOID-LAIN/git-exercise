package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(5, 5));
        panel.setBackground(new Color(0xffff9e));

        // Create thank you label
        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!", SwingConstants.CENTER);
        thankYouLabel.setBounds(10, 10, 200, 20);

        // Add components to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}

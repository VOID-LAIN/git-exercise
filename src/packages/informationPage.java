package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(0xffff9e));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("name");
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField nameField = new JTextField(15);
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
        nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, nameField.getPreferredSize().height));

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("age");
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField ageField = new JTextField(15);
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT);
        ageField.setMaximumSize(new Dimension(Integer.MAX_VALUE, ageField.getPreferredSize().height));

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("email");
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField emailField = new JTextField(15);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailField.setMaximumSize(new Dimension(Integer.MAX_VALUE, emailField.getPreferredSize().height));

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("level of familiarity with similar software");
        levelLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.LINE_AXIS));
        radioPanel.setBackground(new Color(0xffff9e));
        radioPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton level1 = new JRadioButton("beginner");
        JRadioButton level2 = new JRadioButton("intermediate");
        JRadioButton level3 = new JRadioButton("advanced");
        JRadioButton level4 = new JRadioButton("no experience");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        radioPanel.add(Box.createHorizontalGlue());
        radioPanel.add(level1);
        radioPanel.add(Box.createHorizontalStrut(10));
        radioPanel.add(level2);
        radioPanel.add(Box.createHorizontalStrut(10));
        radioPanel.add(level3);
        radioPanel.add(Box.createHorizontalStrut(10));
        radioPanel.add(level4);
        radioPanel.add(Box.createHorizontalGlue());

        // Next Page Button
        JButton nextButton = new JButton("Next Page");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.setBackground(new Color(100,150,200));
        nextButton.setForeground(Color.WHITE);
        nextButton.setFocusPainted(false);

        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(Box.createVerticalGlue()); // Push components to the center vertically
        panel.add(Box.createRigidArea(new Dimension(10, 10))); // Small space at the top
        panel.add(nameLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 5))); // Small space between label and field
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(10, 10))); // Space between sections
        panel.add(ageLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 5)));
        panel.add(ageField);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 5)));
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(levelLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 5)));
        panel.add(radioPanel); // Add the radio button panel
        panel.add(Box.createRigidArea(new Dimension(10, 20))); // Space before the button
        panel.add(nextButton);
        panel.add(Box.createVerticalGlue());

        // Add panel to the frame
        frame.add(panel);
    }
}

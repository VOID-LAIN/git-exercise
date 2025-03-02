package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(0xffff9e));

        // Question 1
        JLabel question1 = new JLabel("How attractive do you find the software's user interface?");
        question1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel radioPanel1 = new JPanel();
        radioPanel1.setLayout(new BoxLayout(radioPanel1, BoxLayout.LINE_AXIS));
        radioPanel1.setBackground(new Color(0xffff9e)); // same as background color
        radioPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio1_1 = new JRadioButton("1");
        JRadioButton radio1_2 = new JRadioButton("2");
        JRadioButton radio1_3 = new JRadioButton("3");
        JRadioButton radio1_4 = new JRadioButton("4");
        JRadioButton radio1_5 = new JRadioButton("5");

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        radioPanel1.add(Box.createHorizontalGlue());
        radioPanel1.add(radio1_1);
        radioPanel1.add(Box.createHorizontalStrut(10));
        radioPanel1.add(radio1_2);
        radioPanel1.add(Box.createHorizontalStrut(10));
        radioPanel1.add(radio1_3);
        radioPanel1.add(Box.createHorizontalStrut(10));
        radioPanel1.add(radio1_4);
        radioPanel1.add(Box.createHorizontalStrut(10));
        radioPanel1.add(radio1_5);
        radioPanel1.add(Box.createHorizontalGlue());

        // Question 2
        JLabel question2 = new JLabel("Is it easy for you to access the various features of the software?");
        question2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel radioPanel2 = new JPanel();
        radioPanel2.setLayout(new BoxLayout(radioPanel2, BoxLayout.LINE_AXIS));
        radioPanel2.setBackground(new Color(0xffff9e)); // same as background color
        radioPanel2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio2_1 = new JRadioButton("1");
        JRadioButton radio2_2 = new JRadioButton("2");
        JRadioButton radio2_3 = new JRadioButton("3");
        JRadioButton radio2_4 = new JRadioButton("4");
        JRadioButton radio2_5 = new JRadioButton("5");

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        radioPanel2.add(Box.createHorizontalGlue());
        radioPanel2.add(radio2_1);
        radioPanel2.add(Box.createHorizontalStrut(10));
        radioPanel2.add(radio2_2);
        radioPanel2.add(Box.createHorizontalStrut(10));
        radioPanel2.add(radio2_3);
        radioPanel2.add(Box.createHorizontalStrut(10));
        radioPanel2.add(radio2_4);
        radioPanel2.add(Box.createHorizontalStrut(10));
        radioPanel2.add(radio2_5);
        radioPanel2.add(Box.createHorizontalGlue());

        // Question 3
        JLabel question3 = new JLabel("How simple and user-friendly is the software page design?");
        question3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel radioPanel3 = new JPanel();
        radioPanel3.setLayout(new BoxLayout(radioPanel3, BoxLayout.LINE_AXIS));
        radioPanel3.setBackground(new Color(0xffff9e)); // same as background color
        radioPanel3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio3_1 = new JRadioButton("1");
        JRadioButton radio3_2 = new JRadioButton("2");
        JRadioButton radio3_3 = new JRadioButton("3");
        JRadioButton radio3_4 = new JRadioButton("4");
        JRadioButton radio3_5 = new JRadioButton("5");

        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        radioPanel3.add(Box.createHorizontalGlue());
        radioPanel3.add(radio3_1);
        radioPanel3.add(Box.createHorizontalStrut(10));
        radioPanel3.add(radio3_2);
        radioPanel3.add(Box.createHorizontalStrut(10));
        radioPanel3.add(radio3_3);
        radioPanel3.add(Box.createHorizontalStrut(10));
        radioPanel3.add(radio3_4);
        radioPanel3.add(Box.createHorizontalStrut(10));
        radioPanel3.add(radio3_5);
        radioPanel3.add(Box.createHorizontalGlue());

        // Question 4
        JLabel question4 = new JLabel("Are the colors and fonts used in the software appropriate?");
        question4.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel radioPanel4 = new JPanel();
        radioPanel4.setLayout(new BoxLayout(radioPanel4, BoxLayout.LINE_AXIS));
        radioPanel4.setBackground(new Color(0xffff9e)); // same as background color
        radioPanel4.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio4_1 = new JRadioButton("1");
        JRadioButton radio4_2 = new JRadioButton("2");
        JRadioButton radio4_3 = new JRadioButton("3");
        JRadioButton radio4_4 = new JRadioButton("4");
        JRadioButton radio4_5 = new JRadioButton("5");

        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);

        radioPanel4.add(Box.createHorizontalGlue());
        radioPanel4.add(radio4_1);
        radioPanel4.add(Box.createHorizontalStrut(10));
        radioPanel4.add(radio4_2);
        radioPanel4.add(Box.createHorizontalStrut(10));
        radioPanel4.add(radio4_3);
        radioPanel4.add(Box.createHorizontalStrut(10));
        radioPanel4.add(radio4_4);
        radioPanel4.add(Box.createHorizontalStrut(10));
        radioPanel4.add(radio4_5);
        radioPanel4.add(Box.createHorizontalGlue());

        // Next button to go to Page3
        JButton nextButton = new JButton("Next Page");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.setBackground(new Color(100,150,200));
        nextButton.setForeground(Color.WHITE);
        nextButton.setFocusPainted(false);

        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(question1);
        panel.add(radioPanel1);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(question2);
        panel.add(radioPanel2);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(question3);
        panel.add(radioPanel3);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(question4);
        panel.add(radioPanel4);
        panel.add(Box.createRigidArea(new Dimension(20, 20)));
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}

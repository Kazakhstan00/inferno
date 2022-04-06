package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;

    private JButton firstPageButton;
    private JButton secondPageButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        firstPageButton = new JButton("ADD STUDENT");
        firstPageButton.setSize(300,30);
        firstPageButton.setLocation(100,100);
        add(firstPageButton);
        firstPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getFirstPage().setVisible(true);
            }
        });

        secondPageButton = new JButton("LIST STUDENT");
        secondPageButton.setSize(300,30);
        secondPageButton.setLocation(100,150);
        add(secondPageButton);
        secondPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getSecondPage().generateTable(parent.uni);
                parent.getMainMenuPage().setVisible(false);
                parent.getSecondPage().setVisible(true);
            }
        });

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
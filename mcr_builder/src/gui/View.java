package gui;

import director.Pizzaiolo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 06.06.2016.
 */
public class View extends JFrame {
    public View() {

        setLayout(new BorderLayout());

        BuilderPanel buildPanel = new BuilderPanel();
        add(buildPanel, BorderLayout.CENTER);

        JButton bakeButton = new JButton("Bake");

        // FIXME : only there to test
        bakeButton.addActionListener(ae -> {
            buildPanel.write(new Pizzaiolo().build().toString());
        });

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        bottom.add(bakeButton);

        add(bottom, BorderLayout.SOUTH);

        pack();

        setTitle("Builder");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 06.06.2016.
 */
public class BuilderPanel extends JPanel {
    // FIXME : only there to test
    JLabel label = new JLabel();

    public BuilderPanel() {
        setPreferredSize(new Dimension(600, 600));
        add(label);
    }

    // FIXME : only there to test
    public void write(String s) {
        label.setText(s);
    }
}

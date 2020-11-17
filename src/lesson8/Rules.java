package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame {

    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 270;

    private MainWindow mainWindow;
    //private Setting settingWindow;

    Rules(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle gameWindowBounds = mainWindow.getBounds();
        int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Window Rules");

        setVisible(false);


        JButton btnOk = new JButton("Ok");
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.getSettingWindow().setVisible(true);
            }
        });

        JPanel panelBottom = new JPanel();
        JLabel panelBottom2 = new JLabel(" Ты знаешь как играть XD ");
        panelBottom.setLayout(new GridLayout());
        panelBottom2.setLayout(new GridLayout());
        panelBottom.add(btnOk);

        add(panelBottom, BorderLayout.SOUTH);
        add(panelBottom2, BorderLayout.NORTH);

    }

}

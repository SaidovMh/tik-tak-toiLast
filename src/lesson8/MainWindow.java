package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public Setting getSettingWindow() {
        return settingWindow;
    }

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POSX = 650;
    private static final int WINDOW_POSY = 270;

    private Setting settingWindow;
    private GameMap gameMap;
    private Rules winRules;


    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setTitle("Игра: Крестики-нолики");

        settingWindow = new Setting(this);
        gameMap = new GameMap();
        winRules = new Rules(this);

        JButton btnStart = new JButton("Create new game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

        JButton btnAboutUs = new JButton("Rules");
        btnAboutUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                winRules.setVisible(true);
            }
        });

        JButton btnExitGame = new JButton("Close");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new GridLayout(1, 3));
        panelBottom.add(btnStart);
        panelBottom.add(btnAboutUs);
        panelBottom.add(btnExitGame);

        add(panelBottom, BorderLayout.SOUTH);
        add(gameMap);

        setResizable(false);
        setVisible(true);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        gameMap.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }

}

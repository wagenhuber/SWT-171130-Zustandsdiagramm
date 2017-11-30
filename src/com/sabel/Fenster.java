package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {

    private enum Farbe {ROT, BLAU, GRUEN, GELB}

    private Farbe farbe;

    private JPanel jpContainer;
    private JButton jbtnA, jbtnB, jbtnC;


    public Fenster() {


        this.setTitle("Mein erstes Fenster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
        this.initEvents();
        this.setSize(300, 300);
        this.setVisible(true);
        this.start();

    }


    public void initComponents() {
        jpContainer = new JPanel();
        jbtnA = new JButton("A");
        jbtnB = new JButton("B");
        jbtnC = new JButton("C");
        jpContainer.add(jbtnA);
        jpContainer.add(jbtnB);
        jpContainer.add(jbtnC);
        this.add(jpContainer);


    }


    public void initEvents() {
        jbtnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//


            }
        });

        jbtnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jbtnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }//ende Init Events


    public void start() {
        farbe = Farbe.ROT;
        setColor();
    }

    private void setColor() {
        switch (farbe) {
            case ROT:
                jpContainer.setBackground(Color.RED);
                break;
            case BLAU:
                jpContainer.setBackground(Color.BLUE);
                break;
            case GELB:
                jpContainer.setBackground(Color.YELLOW);
                break;
            case GRUEN:
                jpContainer.setBackground(Color.GREEN);
                break;
        }
    }

}

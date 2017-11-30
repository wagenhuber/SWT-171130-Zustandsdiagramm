package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {

    private Model model;


    private JPanel jpContainer;
    private JButton jbtnA, jbtnB, jbtnC;


    public Fenster() {


        this.setTitle("Mein erstes Fenster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
        this.initEvents();
        this.setSize(300, 300);
        //FEnster soll erst sichtbar sein, wenn model fertig instanziert
        //this.setVisible(true);


    }

    public void setModel(Model model) {
        this.model = model;
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

                model.pfeilA();

            }
        });

        jbtnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                model.pfeilB();

            }
        });

        jbtnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                model.pfeilC();

            }
        });

    }//ende Init Events




    public void setColor(Farbe farbe) {
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

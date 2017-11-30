package com.sabel;

public class Test {

    public static void main(String[] args) {

        Fenster fenster = new Fenster();
        Model model = new Model(fenster);
        fenster.setModel(model);
        fenster.setVisible(true);
    }

}

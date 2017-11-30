package com.sabel;

public class Model {
    private Fenster fenster;




    private Farbe farbe;

    public Model(Fenster fenster){
        this.fenster = fenster;
        start();
    }


    public void pfeilA() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.GRUEN;
                break;
            case BLAU:
            case GRUEN:
                farbe = Farbe.BLAU;
                break;
            case GELB:
                System.exit(0);

        }
        fenster.setColor(farbe);
    }


    public void pfeilB() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.BLAU;
                break;
            case BLAU:
                farbe = Farbe.ROT;
                break;
            case GRUEN:

            case GELB:
                farbe = Farbe.BLAU;

        }
        fenster.setColor(farbe);
    }



    public void pfeilC() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.ROT;
                break;
            case BLAU:
                farbe = Farbe.GRUEN;
                break;
            case GRUEN:
                farbe = Farbe.GELB;
                break;
            case GELB:
                farbe = Farbe.ROT;

        }
        fenster.setColor(farbe);
    }

    public void start() {
        farbe = Farbe.ROT;
        fenster.setColor(farbe);
    }


}

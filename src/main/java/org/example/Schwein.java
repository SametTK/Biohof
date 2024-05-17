package org.example;

public class Schwein extends Tier{

    public static int MIN_ALTER = 1;
    public static int MAX_ALTER = 6;
    private static int STARTGEWICHT = 20;

    public Schwein(int alterInMonaten, int gewichtInKg, int tierNummer, String hofname){
        super(tierNummer, hofname);
    }


    public void setAlterInMonaten(int alterInMonaten){
        if (alterInMonaten < MIN_ALTER){
            throw new IllegalArgumentException("Kuh muss mindestens " + MIN_ALTER + " Monat(e) alt sein.");
        } else if (alterInMonaten > MAX_ALTER) {
            throw new IllegalArgumentException("Kuh muss mindestens " + MAX_ALTER + " Monat(e) alt sein.");
        }
        this.alterInMonaten = alterInMonaten;
    }

    public void setGewichtInKg(int gewichtInKg){
        int minGewicht = (int) (alterInMonaten* 15 * 0.8);
        int maxGewicht = (int) (alterInMonaten* 15 * 1.2);

        if (minGewicht > gewichtInKg){
            throw new IllegalArgumentException("Huhn muss min. " + minGewicht + "Kg wiegen");
        } else if (maxGewicht < gewichtInKg) {
            throw new IllegalArgumentException("Huhn darf max. " + maxGewicht + "Kg wiegen");
        }

        this.gewichtInKg = gewichtInKg;
    }

}

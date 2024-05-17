package org.example;

public class Huhn extends Tier{


    public static int MIN_ALTER = 1;
    public static int MAX_ALTER = 2;
    private static int STARTGEWICHT = 1;


    public Huhn(int alterInMonaten, int gewichtInKg, int tierNummer, String hofname){
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



        if (STARTGEWICHT > gewichtInKg){
            throw new IllegalArgumentException("Huhn muss min. " + STARTGEWICHT + "Kg wiegen");
        } else if (alterInMonaten < gewichtInKg) {
            throw new IllegalArgumentException("Huhn darf max. " + alterInMonaten + "Kg wiegen");
        }

        this.gewichtInKg = gewichtInKg;
    }

}

package org.example;

import java.lang.invoke.StringConcatFactory;
import java.util.List;

public class Biohof {

    public static int MAX_ANZAHL_KUEHE = 3;
    public static int MIN_ANZAHL_HUEHNER = 10;
    public static int MAX_ANZAHL_SCHWEINE = 5;
    
    private String hofname;
    private List<Tier> tiere;
    
    public Biohof(String hofname){
        setHofName(hofname);
    }

    private void setHofName(String hofname){
        if(hofname == null || hofname.isBlank()){
            throw new IllegalArgumentException("Hofname cannot be null or empty");
        } else if (hofname.length() < 3) {
            throw new IllegalArgumentException("Hofname must be at least 3 characters");
        }
        this.hofname = hofname;
    }

    public boolean aufnehmen(Tier tier){
        if(tiere == null){
            throw new IllegalArgumentException("Tier .aufnehmen. cannot be null");
        } else if (Tier.MAX_ANZAHL_KUEHE < tiere.size()){
            throw new IllegalArgumentException("Tier must be at least 3 characters");
        }

        //TODO Die maximale Anzahl an erlaubten Tieren darf nicht
        // überschritten werden.
        // .
        // MAX_ANZAHL_KUEHE = 3
        // MAX_ANZAHL_HUEHNER = 10
        // MAX_ANZAHL_SCHWEINE = 5
        // .
        // Exception zB.: Kuh-Stall ist voll.
        // Es können nur Kühe, Schweine und Hühner
        // aufgenommen werden, sonst wird eine Exception
        // geworfen: für dieses Tier gibt es keinen Stall


        for(Tier t : tiere){
            if (t.equals(tier)){
                throw new IllegalArgumentException("Tier already exists");
            }
        }

        return tiere.add(tier);
    }




}

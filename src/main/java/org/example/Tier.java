package org.example;

import java.math.BigDecimal;

public abstract class Tier extends Biohof{

    private static int idCounter = 0;
    private final int tierNumber;
    private BigDecimal verkaufspreis;
    protected int alterInMonaten;
    protected int gewichtInKg;


    public Tier(String hofname) {
        super(hofname);
        this.tierNumber = idCounter++;

    }
    //----------Getter---------------------------//
    public int getTierNumber() {
        return tierNumber;
    }
    public BigDecimal getVerkaufspreis() {
        return verkaufspreis;
    }
    public int getAlterInMonaten() {
        return alterInMonaten;
    }

    public int getGewichtInKg() {
        return gewichtInKg;
    }
    //----------Setter---------------------------//


    public void setVerkaufspreis(BigDecimal verkaufspreis) {
            this.verkaufspreis = verkaufspreis;
    }




    //-------------------------------------------//

    public BigDecimal berechneVerkaufspreis() {
        return verkaufspreis;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n TierNummer: ").append(tierNumber);
        sb.append("\nTier: ").append(verkaufspreis);
        sb.append("\nAlter In Monaten: ").append(alterInMonaten);
        sb.append("\nGewicht: ").append(gewichtInKg).append("kg");
        return sb.toString();
    }



}
